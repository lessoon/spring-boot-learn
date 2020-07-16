package com.lesson.controller;

import com.lesson.model.WebpageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Hello again,add return param to web page.
 *
 * @author Du Lee
 * @version 1.0
 * @since JDK 1.8
 * <p>Date: 2020-07-15 15-04
 */
@Controller
public class HelloAgainController {

    @RequestMapping("/helloAgain")
    public String hello(Model model) {
        WebpageModel webpageModel = new WebpageModel();
        webpageModel.setMsg("Hello World Again!");
        model.addAttribute("webpageModel", webpageModel);
        return "helloAgain";
    }
}
