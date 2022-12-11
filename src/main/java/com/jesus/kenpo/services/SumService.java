package com.jesus.kenpo.services;

import org.springframework.stereotype.Service;

@Service
public class SumService {

    public Integer getSumOfTwoNumbers(Integer value1, Integer value2) {
        return value1 + value2;
    }
}
