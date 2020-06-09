import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

/**
 * 启动类
 */
@Slf4j
@SpringBootApplication
@MapperScan(basePackages = {"com.A.reponsitory.*", "com.B.reponsitory.*"})
public class MyApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApplication.class);
        Environment env = context.getEnvironment();
    }
}