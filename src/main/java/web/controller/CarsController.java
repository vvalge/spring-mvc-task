package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService;
    private Car car1 = new Car("Jack", "Ford", 1993);
    private Car car2 = new Car("Dave", "Dodge", 1972);
    private Car car3 = new Car("Jenny", "Cadillac", 1984);
    private Car car4 = new Car("Sally", "Pontiac", 1961);
    private Car car5 = new Car("Bob", "Buick", 2005);
    private Car car6 = new Car("Steven", "Chevy", 2017);

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        carService.addCar(car5);
        carService.addCar(car6);
    }
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> carList = carService.getCarList();
        List<Car> cars = new ArrayList<>();
        if (count == null || count > carList.size() || count >= 5) {
            count = carList.size();
        }
        for (int i = 0; i < count; i++) {
            cars.add(carList.get(i));
        }
        model.addAttribute("cars",cars);
        return "cars";
    }
}
