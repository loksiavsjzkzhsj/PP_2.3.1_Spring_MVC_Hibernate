package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImp implements CarDAO {
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("BMW", 2023, "black"));
        carsList.add(new Car("Audi", 2021, "red"));
        carsList.add(new Car("Honda", 2022, "green"));
        carsList.add(new Car("Mercedes", 2023, "yellow"));
        carsList.add(new Car("Ford", 2024, "blue"));
    }


    @Override
    public List<Car> getCarList() {
        return carsList;
    }

    @Override
    public void addCarToList(Car car) {
        if (carsList == null) {
            carsList = new ArrayList<>();
            carsList.add(car);
        }
        carsList.add(car);
    }

    @Override
    public List<Car> getTheNumberOfCars(List<Car> cars, Integer number) {
        if (number == null || number >= 5) {
            return carsList;
        }
        return cars.stream().limit(number).toList();
    }
}
