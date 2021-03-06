package com.cc.aop;

import com.cc.utils.ThreadLocalTest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/6 14:12
 **/
@Aspect
@Component
@Slf4j
public class LoggerAspect {

    @Pointcut("execution(* com.cc.controller..*.*(..))")
    public void log() {

    }

    @Around("log()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch clock = new StopWatch();
        clock.start();

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Object[] obj = joinPoint.getArgs();
        StringBuffer sbuffer = new StringBuffer();
        if (obj != null) {
            for (Object object : obj) {
                sbuffer.append(object + ",");
            }
        }

        ThreadLocalTest.getThreadLocal().set(1);

        log.info("Remote IP:{} |access:{} |params:{}", request.getRemoteAddr(), joinPoint.getTarget().getClass().getName() + "-" + joinPoint.getSignature().getName(), sbuffer.toString());
        Object res = (Object) joinPoint.proceed();
        clock.stop();
        log.info("Run time:{}ms Return:{}", clock.getTotalTimeMillis(), res.toString());

        //tomcat存在线程池，单个线程用完后注意 销毁
        log.info("---------threadlocal value:{}", ThreadLocalTest.getThreadLocal().get());
        ThreadLocalTest.getThreadLocal().remove();

        return res;
    }


}
