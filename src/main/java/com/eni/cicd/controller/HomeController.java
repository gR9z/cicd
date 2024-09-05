package com.eni.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> getInfo() {
        return Map.of(
                "name", "Jujube",
                "email", "jujube@campus-eni.fr",
                "date", LocalDate.now().toString()
        );
    }
}
