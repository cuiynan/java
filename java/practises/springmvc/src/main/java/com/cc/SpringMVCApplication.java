package com.cc;

import com.cc.intercepter.FirstIntercepter;
import com.cc.intercepter.SecondIntercepter;
import com.cc.intercepter.ThirdIntercepter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

    @SpringBootApplication
    public class SpringMVCApplication extends WebMvcConfigurerAdapter {

        public static void main(String[] args) {
            SpringApplication.run(SpringMVCApplication.class, args);
        }

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new SecondIntercepter());
            registry.addInterceptor(new FirstIntercepter());
            registry.addInterceptor(new ThirdIntercepter());
        }


    }
