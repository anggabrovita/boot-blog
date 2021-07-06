package com.rindu.bootblog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rindu.bootblog.controller"))
                .paths(PathSelectors.regex("/api/.*"))
                .build()
                .apiInfo(ApiInfo());
    }

    private ApiInfo ApiInfo() {
        return new ApiInfoBuilder()
                .title("BLOG REST API Documentation")
                .description("Spring Boot BLOG Project")
                .termsOfServiceUrl("aa.bb@gmail.com")
                .version("1.0.0")
                .license("MIT License").licenseUrl("aa.bb@gmail.com")
                .contact(new Contact(null, null, "aa.bb@gmail.com"))
                .version("0.0.1")
                .build();
    }

}
