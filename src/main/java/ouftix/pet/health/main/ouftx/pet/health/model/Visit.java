package ouftix.pet.health.main.ouftx.pet.health.model;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by zt974 on 15-Nov-16.
 */
@Builder
@ToString
public class Visit {
    private LocalDate date;
    private String description;
    private double cost;
    @Singular
    private List<Pet> pets;
    private People veterinary;
}
