package groupone.demo.controller;

import groupone.demo.model.Car;
import groupone.demo.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FrontpageController {

    private CarService carService;

    public FrontpageController(CarService carService){
        this.carService = carService;
    }


    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("cars", carService.findAll());
        return "frontpage/frontpage";
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "aboutus/aboutus";
    }

    @GetMapping("/contacts")
    public String contact() {
        return "contact/contact";
    }






}
