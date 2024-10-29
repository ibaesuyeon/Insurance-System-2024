package com.example.insurance.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.insurance")  // Mapper 인터페이스가 위치한 패키지
public class MyBatisConfig {
}
