package com.example.insurance.insurance.repository;

import com.example.insurance.insurance.entity.Insurance;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InsuranceMapper {
    List<Insurance> selectInsuranceList();
}
