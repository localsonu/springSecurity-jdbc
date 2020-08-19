package com.spring.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String home() {
        return "hello everyone ";
    }

    @GetMapping("/admin")
    public String admin() {
        return "hello admin ";
    }

    @GetMapping("/user")
    public String user() {
        return "hello user ";
    }

    @GetMapping("/api")
    public String apis() {
        return "hello apis of mobile app  ";
    }
}
