package com.buildledger.compliance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication @EnableJpaAuditing @EnableFeignClients
public class ComplianceServiceApplication {
    public static void main(String[] args) { SpringApplication.run(ComplianceServiceApplication.class, args); }
}

