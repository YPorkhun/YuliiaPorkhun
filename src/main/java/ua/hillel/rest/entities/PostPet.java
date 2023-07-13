package ua.hillel.rest.entities;
import lombok.Data;

@Data
public class PostPet {
    private Integer petId;
    private String name;
    private String status;
}
