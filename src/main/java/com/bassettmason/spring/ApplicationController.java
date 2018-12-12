package com.bassettmason.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class ApplicationController {

    //hello world prints /
    @RequestMapping("/")
    @ResponseBody
    public String helloWorld () {
        String hello = "hello";
        return hello;
    }
    //capitalize string after capitalize/
    @RequestMapping(value = "/capitalize/{capitalizeMe}", method = GET)
    @ResponseBody
    public String upperCase(@PathVariable("capitalizeMe") String capitalizeMe) {

        return capitalizeString(capitalizeMe);
    }

    public static String capitalizeString(String string) {
        return string.toUpperCase();
    }


}
