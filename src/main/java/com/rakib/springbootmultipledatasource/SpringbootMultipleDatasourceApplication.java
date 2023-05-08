package com.rakib.springbootmultipledatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class})
public class SpringbootMultipleDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMultipleDatasourceApplication.class, args);
    }

}
