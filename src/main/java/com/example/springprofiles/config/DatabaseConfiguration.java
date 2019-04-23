package com.example.springprofiles.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(DatabaseConfiguration.class)
@ConfigurationProperties("spring.datasource")
public class DatabaseConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseConfiguration.class.getName());

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    Normally these methods would return a DataSource object
     */
    @Profile("dev")
    @Bean
    public String devDatabaseConnection() {
        logger.info("DB connection for DEV - H2");
        logger.info(driverClassName);
        logger.info(url);
        return "DB connection for DEV - H2";
    }

    @Profile("test")
    @Bean
    public String testDatabaseConnection() {
        logger.info("DB Connection to RDS_TEST - Low Cost Instance");
        logger.info(driverClassName);
        logger.info(url);
        return "DB Connection to RDS_TEST - Low Cost Instance";
    }

    @Profile("prod")
    @Bean
    public String prodDatabaseConnection() {
        logger.info("DB Connection to RDS_PROD - High Performance Instance");
        logger.info(driverClassName);
        logger.info(url);
        return "DB Connection to RDS_PROD - High Performance Instance";
    }
}
