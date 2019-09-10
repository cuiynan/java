package com.cc.config;

import org.springframework.beans.factory.annotation.Value;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

public class SwaggerApi {
    final static String title = "XX项目接口文档";
    final static String titleDesc = "XX项目文档相关说明哦";
    final static String author = "XX项目文档相关说明哦";
    final static String address = "XX项目文档相关说明哦";
    final static String email = "XX项目文档相关说明哦";
    @Value("${version}")
    String version;

    public static ApiInfo apiInfo(){
        return new SwaggerApi().info();
    }

    public ApiInfo info() {
        return new ApiInfoBuilder().title(title)
                .contact(new Contact(author, address, email))
                .description(titleDesc)
//                .termsOfServiceUrl("NO terms of service")
//                .license("The Apache License, Version 2.0")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version(version)
                .build();
    }
}

