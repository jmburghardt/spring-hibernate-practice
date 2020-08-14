package com.warhammer.missions.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // need a controller method to show the initial form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method for processing the form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // new controller method to read form data
    // add data to model

    @RequestMapping("/shoutForm")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request param from HTML form
        String theName = request.getParameter("studentName");

        // convert data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/paramForm")
    public String paramBinder(@RequestParam("studentName") String theName, Model model) {

        // convert data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Hey buddy " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
