package groupone.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontpageController {


    @GetMapping("/home")
    public String index() {
        return "frontpage/frontpage";
    }
}
