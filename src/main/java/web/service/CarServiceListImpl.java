package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceListImpl implements CarService {

    @Autowired
    CarDao carDao;

    @Override
    public void addCar(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> getCarList() {
        return carDao.listCars();
    }

    @Override
    public List<Car> getCarList(int count) {
        return carDao.listCars(count);
    }
}
