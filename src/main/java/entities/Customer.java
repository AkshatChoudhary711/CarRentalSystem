package entities;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer {
    @Id
    @Indexed(unique = true)
    private ObjectId id;
    @NonNull
    private String name;
    private long contactNo;
    private long aadhaarNo;
}
