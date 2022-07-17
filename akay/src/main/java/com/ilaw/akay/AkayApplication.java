package com.ilaw.akay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class AkayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AkayApplication.class, args);
    }
}
