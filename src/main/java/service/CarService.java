package service;

import java.util.ArrayList;
import java.util.List;
import model.Car;
import org.springframework.stereotype.Service;

@Service
public class CarService {
  public List<Car> getListCar() {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("Anton", "Audi", 3321));
    cars.add(new Car("Kiril", "Mazda", 1981));
    cars.add(new Car("Anna", "Toyota", 2754));
    return cars;
  }
}
