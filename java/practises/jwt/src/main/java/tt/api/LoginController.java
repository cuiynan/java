package tt.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RestController;
import tt.config.JwtConfig;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tt.response.ApiResponse;
import tt.response.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2020/10/27 16:22
 * @desc :
 */
@RestController
public class LoginController {

    @GetMapping("hi")
    public String hi() {
        return "hello world";
    }

    @Resource
    private JwtConfig jwtConfig ;


    @PostMapping("login")
    public ApiResponse<?> login(@RequestParam("userName") String userName,
                             @RequestParam("passWord") String passWord) {
        JSONObject json = new JSONObject();

        /** 验证userName，passWord和数据库中是否一致，如不一致，直接return ResultTool.errer(); 【这里省略该步骤】*/

        // 这里模拟通过用户名和密码，从数据库查询userId
        // 这里把userId转为String类型，实际开发中如果subject需要存userId，则可以JwtConfig的createToken方法的参数设置为Long类型
        String userId = 5 + "";

        User user = new User   ();
        List list = new ArrayList<Integer>();
        list.add(112341234);
        list.add(2134);
        list.add(3134);
        list.add(4134);
        list.add(51234);
        list.add(112341);
        list.add(112341);
        list.add(112341);
        list.add(112341);
        list.add(112341);
        list.add(112341);
        list.add(112341);
        list.add(112341);
        list.add(112341);
        user.setList(list);
        user.setUsername("akdfj;akjd; lajf");
        user.setRoleName("asljf;aksjf;aklsjdf;kj中文件工苛1管是喁");

        String token = jwtConfig.createToken(JSON.toJSONString(user));
        if (!StringUtils.isEmpty(token)) {
            json.put("token", token);
        }
        return ApiResponse.success(json);
    }

    /**
     * 需要 Token 验证的接口
     */
    @PostMapping("/info")
    public ApiResponse<?> info() {
        return ApiResponse.success("info");
    }

    /**
     * 根据请求头的token获取userId
     *
     * @param request
     * @return
     */
    @GetMapping("/getUserInfo")
    public ApiResponse<?> getUserInfo(HttpServletRequest request) {
        String usernameFromToken = jwtConfig.getUsernameFromToken(request.getHeader("token"));
        return ApiResponse.success(usernameFromToken);
    }
}
