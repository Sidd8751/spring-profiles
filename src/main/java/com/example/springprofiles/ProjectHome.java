package com.example.springprofiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectHome {

    private static final Logger logger = LoggerFactory.getLogger(ProjectHome.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(ProjectHome.class, args);
    }

    @Bean
    public String message(@Value("${app.message}") String message) {
        logger.info(message);
        return null;
    }
}
