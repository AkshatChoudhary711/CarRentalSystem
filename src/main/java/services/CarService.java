package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.CarRepository;

@Component
public class CarService {
    @Autowired
    private CarRepository carRepository;


}
