package com.paradkar.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        System.out.println("Index File Executed");
        return "welcome";
    }
    @RequestMapping("/aboutus")
    public String aboutus(){
        return "aboutus";
    }
}
