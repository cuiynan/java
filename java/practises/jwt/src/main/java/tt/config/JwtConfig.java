package tt.config;

/**
 * @author : cuiyingnan
 * @date : 2020/10/27 16:21
 * @desc :
 */

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * JWT的token，区分大小写
 */
@PropertySource("application.yml")
@ConfigurationProperties(prefix = "config.jwt")
@Component
@Data
public class JwtConfig {

    private String secret;
    private long expire;
    private String header;

    /**
     * 生成token
     *
     * @param subject
     * @return
     */
    public String createToken(String subject) {
        Date nowDate = new Date();
        Date expireDate = new Date(nowDate.getTime() + expire);//过期时间

        return Jwts.builder()
                //发布者
                .setHeaderParam("iss", "cui")
                //token类型
                .setHeaderParam("typ", "JWT")
                //主题
                .setSubject(subject)
                //发布时间
                .setIssuedAt(nowDate)
                //过期时间
                .setExpiration(expireDate)
                //签名密钥
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }


    /**
     * 获取token中注册信息
     *
     * @param token
     * @return
     */
    public Claims getTokenClaim(String token) {
        try {
            return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            // e.printStackTrace();
            return null;
        }
    }

    /**
     * 验证token是否过期失效
     *
     * @param expirationTime
     * @return
     */
    public boolean isTokenExpired(Date expirationTime) {
        return expirationTime.before(new Date());
    }

    public boolean isTokenExpired(String token) {
        Date expirationTime = getExpirationDateFromToken(token);
        return expirationTime.before(new Date());
    }

    /**
     * 获取token失效时间
     *
     * @param token
     * @return
     */
    public Date getExpirationDateFromToken(String token) {
        return getTokenClaim(token).getExpiration();
    }

    /**
     * 获取用户名从token中
     */
    public String getUsernameFromToken(String token) {
        return getTokenClaim(token).getSubject();
    }

    /**
     * 获取jwt发布时间
     */
    public Date getIssuedAtDateFromToken(String token) {
        return getTokenClaim(token).getIssuedAt();
    }
}
