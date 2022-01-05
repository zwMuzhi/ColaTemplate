package com.muzhi.care;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.muzhi.care","com.alibaba.cola"})
public class CareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CareApplication.class, args);
    }
}
