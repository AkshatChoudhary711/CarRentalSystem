package entities;

import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;

@Component

public class Car {
    private String regNo;
    private String brand;
    private String model;
    private int seatCount;
}
