package com.spring.basic.com.spring.basic.FirstBasic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHi()
    {
        return "Hello";
    }
}
