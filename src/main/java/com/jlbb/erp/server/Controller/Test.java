package com.jlbb.erp.server.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("")
    public String dealIndex(){
        return "Hello World";
    }

}
