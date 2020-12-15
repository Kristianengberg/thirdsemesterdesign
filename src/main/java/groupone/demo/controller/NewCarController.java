package groupone.demo.controller;

import groupone.demo.model.Car;
import groupone.demo.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewCarController {

    private CarService carService;

    public NewCarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/newCar")
    public String newCar() {
        return "/carpage/newCar";
    }

    @RequestMapping(value = "/newCar/addCar", method = RequestMethod.POST)
    public String addCar(Car car) {
        carService.save(car);
        return "redirect:/newCar";
    }


}
