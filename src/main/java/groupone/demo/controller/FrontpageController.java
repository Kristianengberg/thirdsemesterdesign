package groupone.demo.controller;

import groupone.demo.model.Car;
import groupone.demo.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FrontpageController {

    public FrontpageController(){

    }


    @GetMapping("/home")
    public String index() {
        return "frontpage/frontpage";
    }
}
