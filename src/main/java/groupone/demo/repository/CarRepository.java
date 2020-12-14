package groupone.demo.repository;

import groupone.demo.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarRepository extends PagingAndSortingRepository<Car, Long> {

}
