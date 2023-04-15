package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    void add(Car car);

    List<Car> listCars();

    List<Car> listCars(int count);
}
