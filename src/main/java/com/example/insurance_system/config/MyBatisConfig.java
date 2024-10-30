package com.example.insurance_system.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.insurance_system")  // Mapper 인터페이스가 위치한 패키지
public class MyBatisConfig {
}
