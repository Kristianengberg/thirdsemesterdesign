package groupone.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/carpage")
    public String carPage(){
        return "/carpage/carpage";
    }
}
