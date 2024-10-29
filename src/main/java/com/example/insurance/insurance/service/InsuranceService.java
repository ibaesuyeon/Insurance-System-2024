package com.example.insurance.insurance.service;

import com.example.insurance.insurance.entity.Insurance;
import com.example.insurance.insurance.repository.InsuranceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceService {

    @Autowired
    InsuranceMapper insuranceMapper;

    public List<Insurance> getAllInsurance() {
        return insuranceMapper.selectInsuranceList();
    }
}
