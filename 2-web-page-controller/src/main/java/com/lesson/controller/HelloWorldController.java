package com.lesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello World the web Page controller
 *
 * @author Du Lee
 * @version 1.0
 * @since JDK 1.8
 * <p>Date: 2020-07-15 14-50
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
