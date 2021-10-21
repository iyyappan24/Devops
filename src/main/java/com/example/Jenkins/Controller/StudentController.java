package com.example.Jenkins.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/get")
    public String getData(){

        return "This is from Jenkins";
    }





}
