package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> cars(Integer count) {
        List<Car> cars = new ArrayList<>();
        {
            cars.add(new Car(1, "Mazda", 5));
            cars.add(new Car(2, "Lada", 3));
            cars.add(new Car(3, "Porsche", 24));
            cars.add(new Car(4, "Rover", 1));
            cars.add(new Car(5, "BMW", 4));
        }
        return cars.stream().limit(count).toList();
    }
}

