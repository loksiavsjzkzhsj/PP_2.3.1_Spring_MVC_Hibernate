package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {
    private List<Car> carsList;

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCarInfo(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        carsList = carService.getTheNumberOfCars(carService.getCarList(), count);

        model.addAttribute("carsList", carsList);
        return "car-info";
    }
}
