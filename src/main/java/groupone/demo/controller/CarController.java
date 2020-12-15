package groupone.demo.controller;

import groupone.demo.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService){
        
    }

    @GetMapping("/carpage")
    public String carPage(){
        return "/carpage/carpage";
    }
}
