package com.example.caller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallController {
    @Autowired
    private Environment env;

    @GetMapping("/call")
    public String call() {
        return env.getProperty("service.b");
    }
}
