package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {
    //request param
    //http://localhost:8080/api/v1/calculator/add?num1=1&num2=8.3
    @GetMapping("/add")
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2){
        return num1+ num2;
    }
    //path variable
    @GetMapping("/sub/{num1}/{num2}")
    public Double substraction(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
        if(num1>num2){
            return num1-num2;
        }
        else{
            return num2-num1;
        }
    }
    @PostMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
    Double result = null;
    result = calculatorDTO.getNum1()* calculatorDTO.getNum2()* calculatorDTO.getNum3()* calculatorDTO.getNum4();
    ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);
    return responseEntity;

    }
}
