package com.bassettmason.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ApplicationController {


    @RequestMapping("/")
    public RedirectView homeRedirect() {
        return new RedirectView("/albums");
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/hello/{pineapple}/{fromPerson}")
    public String helloToYou(@PathVariable(name="pineapple") String myName,
                             @PathVariable String fromPerson,
                             Model model) {
        model.addAttribute("myName", myName);
        return "potato";
    }
}
