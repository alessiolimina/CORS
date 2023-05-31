package it.develhope.CORS2.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/custom")
public class CustomController {

    @GetMapping("")
    public String getWelcome(){
        return "Welcome, mate!";
    }
}
