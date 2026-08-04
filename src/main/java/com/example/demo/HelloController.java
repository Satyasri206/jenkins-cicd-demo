package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController
public class HelloController{
@GetMapping("/") public String home(){return "Jenkins CI/CD Demo";}
@GetMapping("/health") public String health(){return "UP";}
}