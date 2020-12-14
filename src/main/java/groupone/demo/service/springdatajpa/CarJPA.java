package groupone.demo.service.springdatajpa;

import groupone.demo.model.Car;
import groupone.demo.repository.CarRepository;
import groupone.demo.service.CarService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class CarJPA implements CarService {

    private final CarRepository carRepository;

    public CarJPA(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    @Override
    public Set<Car> findAll() {

        Set<Car> set = new HashSet<>();
        carRepository.findAll().forEach(set::add);
        return set;

    }

    @Override
    public Car save(Car object) {
        return carRepository.save(object);
    }

    @Override
    public void delete(Car object) {

        carRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {

        carRepository.deleteById(aLong);

    }

    @Override
    public Optional<Car> findById(Long aLong) {
        return carRepository.findById(aLong);
    }
}
