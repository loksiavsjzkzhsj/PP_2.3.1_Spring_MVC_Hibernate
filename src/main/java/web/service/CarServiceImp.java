package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;


import java.util.List;

//@Service
@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> getCarList() {
        return carDAO.getCarList();
    }

    @Override
    public void addCarToList(Car car) {
        carDAO.addCarToList(car);
    }

    @Override
    public List<Car> getTheNumberOfCars(List<Car> cars, Integer number) {
        return carDAO.getTheNumberOfCars(cars, number);
    }
}
