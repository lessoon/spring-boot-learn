package com.lesson.controller;

import com.lesson.model.WebpageModel;
import com.lesson.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    private HelloWorldService service;

    @RequestMapping("/sayHello")
    public String hello(Model model) {
        WebpageModel webpageModel = new WebpageModel();
        webpageModel.setMsg(service.sayHello());
        model.addAttribute("webpageModel", webpageModel);
        return "hello";
    }
}
