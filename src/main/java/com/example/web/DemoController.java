package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chensy
 * @since 17/4/17.
 */
@RestController
public class DemoController {

    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "hello world";
    }
}
