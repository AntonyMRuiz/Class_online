package com.riwi.class_online.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Api to manage the Class Online Riwi",
        version = "1.0",
        description = "EndPoint documentation of the Class Online Riwi application"
    )
)
public class OpenApiCongiguration {
    
}
