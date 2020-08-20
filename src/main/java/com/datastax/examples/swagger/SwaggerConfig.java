package com.datastax.examples.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("orders")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/orders/**"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Spring Data Cassandra REST API",
                "Sample REST API for Orders: powered by DataStax Astra",
                "1.0.0",
                "Terms of service",
                new Contact("DataStax Examples", "https://www.datastax.com/examples", "examples@datastax.com"),
                "Apache v2.0", "http://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
    }

}