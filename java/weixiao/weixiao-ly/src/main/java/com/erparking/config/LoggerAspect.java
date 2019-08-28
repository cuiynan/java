package com.erparking.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class LoggerAspect {

    Logger log = LoggerFactory.getLogger(LoggerAspect.class);

    @Pointcut("execution(* com.erparking.controller.*.*(..))")
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
        log.info("Remote IP:{} |access:{} |params:{}", request.getRemoteAddr(), joinPoint.getTarget().getClass().getName() + "-" + joinPoint.getSignature().getName(), sbuffer.toString());
        Object object = joinPoint.proceed();
        clock.stop();
        log.info("Run time:{}ms Return:{}", clock.getTotalTimeMillis(), object);
        return object;
    }


}
