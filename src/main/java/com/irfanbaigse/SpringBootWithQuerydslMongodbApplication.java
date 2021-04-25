package com.irfanbaigse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBootWithQuerydslMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithQuerydslMongodbApplication.class, args);
    }

}
