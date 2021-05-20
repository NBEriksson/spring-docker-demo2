package com.example.springdocker.service;

import com.example.springdocker.model.Car;
import com.example.springdocker.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CarService {
    //private final CarRepository repository;
    private final CarRepository repository = null;

    public List<Car> getCars() {
        return repository.findAll();
    }

    public void saveNewCar(Car car) {
        repository.save(car);
    }

    public List<String> getDrivableCars() {
        // hämtar alla Cars som är i drift
        List<Car> drivableCar = repository.findCarByInUse(true);

        // returnerar endast modell-namnen i en lista
        return drivableCar.stream()
                .map(car -> car.getModel())
                .collect(Collectors.toList());
    }
}
