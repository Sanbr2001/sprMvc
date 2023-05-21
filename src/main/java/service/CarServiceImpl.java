package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(int count) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Make 1", "Model 1", 2021));
        cars.add(new Car("Make 2", "Model 2", 2022));
        cars.add(new Car("Make 3", "Model 3", 2023));
        cars.add(new Car("Make 4", "Model 4", 2024));
        cars.add(new Car("Make 5", "Model 5", 2025));


        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
