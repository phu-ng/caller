package com.example.caller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallController {
    @Autowired
    private Environment env;

    public void doSomething(int a, int b) {
        if (a == b)
            System.out.println("a equals b");
        else if (a != b)
            System.out.println("a does not equal b");
        else if (a < b)
            System.out.println("a is less than b");
        else if (a > b)
            System.out.println("a is greater than b");
    }

    @GetMapping("/call")
    public String call() {
        return env.getProperty("service.b");
    }
}
