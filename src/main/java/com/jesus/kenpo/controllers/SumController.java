package com.jesus.kenpo.controllers;

import com.jesus.kenpo.services.SumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sum")
public class SumController {

    private final SumService sumService;

    public SumController(SumService sumService) {
        this.sumService = sumService;
    }

    @GetMapping("/result")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> getSumOfTwoNumbers(@RequestParam("value1") Integer value1, @RequestParam("value2") Integer value2) {
        return new ResponseEntity<>(this.sumService.getSumOfTwoNumbers(value1, value2), HttpStatus.OK);
    }
}
