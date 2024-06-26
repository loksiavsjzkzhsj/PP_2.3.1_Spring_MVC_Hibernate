package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    void addCarToList(Car car);
    List<Car> getCarList();
    List<Car> getTheNumberOfCars(List<Car> cars, Integer number);

}
