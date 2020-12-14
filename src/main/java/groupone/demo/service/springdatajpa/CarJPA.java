package groupone.demo.service.springdatajpa;

import groupone.demo.model.Car;
import groupone.demo.service.CarService;

import java.util.Optional;
import java.util.Set;

public class CarJPA implements CarService {

    @Override
    public Set<Car> findAll() {
        return null;
    }

    @Override
    public Car save(Car object) {
        return null;
    }

    @Override
    public void delete(Car object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Car> findById(Long aLong) {
        return Optional.empty();
    }
}
