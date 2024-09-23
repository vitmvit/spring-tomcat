package web.dao.impl;

import org.springframework.stereotype.Repository;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("model1", "white", 2020));
        carList.add(new Car("model2", "black", 2019));
        carList.add(new Car("model3", "red", 2021));
        carList.add(new Car("model4", "blue", 2015));
        carList.add(new Car("model5", "yellow", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        return count == 0 ? carList : carList.stream().limit(count).collect(Collectors.toList());
    }
}