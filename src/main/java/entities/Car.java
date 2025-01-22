package entities;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.data.annotation.Id;

import java.lang.annotation.Documented;


@Document
@Data
public class Car {
    @Id
    @Indexed(unique = true)
    private String regNo;
    @NonNull
    private String brand;
    @NonNull
    private String model;
    private int seatCount;
}
