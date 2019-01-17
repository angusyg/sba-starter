package com.angusyg.sba.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/up")
    public String isUp() {
        return "I'm Up !!!WWWWWWWWWWWWWWWWWWWXXXXXXWWWXXX!";
    }
}
