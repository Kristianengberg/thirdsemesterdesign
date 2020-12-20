package groupone.demo.controller;

import groupone.demo.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/carPage")
    public String getCars(Model model){
        model.addAttribute("cars", carService.findAll());
        return "carpage/carPage";
    }

    @RequestMapping("/contacts")
    public String btnContact() {
        return "contact/contact";
    }

}
