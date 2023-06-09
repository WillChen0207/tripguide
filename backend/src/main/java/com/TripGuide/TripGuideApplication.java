package com.TripGuide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.TripGuide.mapper")
public class TripGuideApplication {
    public static void main(String[] args) {
        SpringApplication.run(TripGuideApplication.class, args);
    }
}
