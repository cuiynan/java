package com.files;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author : cuiyingnan
 * @date : 2019/12/24 16:50
 * @desc :
 */
@Configuration
public class FilePathConfig extends WebMvcConfigurerAdapter {

    @Value("${files.static.accessPath}")
    String fileApiPath;

    @Value("${files.upload.serverPath}")
    String serverPath;


    /**
     * 直接将某目录映射出去
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(fileApiPath).addResourceLocations("file:" + serverPath);
        super.addResourceHandlers(registry);
    }


}
