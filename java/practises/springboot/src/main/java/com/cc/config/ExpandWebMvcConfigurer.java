package com.cc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/8/19 11:58
 * @desc : 由于springboot按list中的优先级默认使用json进行返回数据，我们使用configuration来扩展前台过来的请求，指定我们一种
 * application/json
 * application/xml
 */
@Configuration
public class ExpandWebMvcConfigurer implements WebMvcConfigurer {
    /**
     * 直接更改 springboot 默认json为xml
     * 还有一种方法就是强制设置coverters[0] = new MappingJackson2XmlHttpMessageConverter(builder.build());
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        System.out.println("-----converters:" + converters);
        converters.clear();
        System.out.println("-----converters:" + converters);
        Jackson2ObjectMapperBuilder builder;
        builder = Jackson2ObjectMapperBuilder.xml();
        converters.add(new MappingJackson2XmlHttpMessageConverter(builder.build()));
    }
}
