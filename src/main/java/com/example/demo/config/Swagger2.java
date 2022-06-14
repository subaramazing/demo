package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Admin
 * @createTime 2022/5/19 9:28
 * @discription
 **/

@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi(){

        return new Docket(DocumentationType.SWAGGER_2)  //指定api类型为swagger2
                .apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.example.demo"))  //指定controller包
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("demo接口API")
                .contact(new Contact("imooc","http://www.imooc.com","demo@imooc.com"))
                .description("学习创建API接口文档")
                .version("1.0")
                .termsOfServiceUrl("http://www.imooc.com")
                .build();
    }
}
