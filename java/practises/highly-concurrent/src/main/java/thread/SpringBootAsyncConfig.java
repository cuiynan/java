package thread;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.target.ThreadLocalTargetSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/8 14:39
 **/
//@Configuration
//@EnableAsync
public class SpringBootAsyncConfig {

    @Bean
    public Executor asyncServiceExecutor() {
//        log.info("这里什么时候执行的？");
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setAllowCoreThreadTimeOut(false);
        executor.setCorePoolSize(5);
        executor.setKeepAliveSeconds(5000);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(9999);
        executor.setThreadNamePrefix("my-thread-");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();

        return executor;
    }


}
