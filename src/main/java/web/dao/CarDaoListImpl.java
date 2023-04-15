package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoListImpl implements CarDao {

    List<Car> carList = new ArrayList<>();

    @Override
    public void add(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> listCars() {
        return carList;
    }

    @Override
    public List<Car> listCars(int count) {
        return carList.subList(0, Math.min(carList.size(), count + 1));
    }

}