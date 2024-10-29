package com.example.insurance.insurance.controller;

import com.example.insurance.insurance.service.InsuranceService;
import com.example.insurance.insurance.entity.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    @Autowired
    InsuranceService insuranceService;

    @GetMapping("/all")
    public List<Insurance> getAllInsurance() {
        return insuranceService.getAllInsurance();
    }
}