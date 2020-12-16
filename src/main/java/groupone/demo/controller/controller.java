package groupone.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {


    @GetMapping("/contacts")
    public String returnContacts(){
        return "contact/contact";
    }

    @GetMapping("/aboutus")
    public String returnAboutUS(){
        return "aboutus/aboutus";
    }

    @GetMapping("/test")
    public String test(){
        return "contact/test";
    }



}
