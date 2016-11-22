package ouftix.pet.health.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

/**
 * Created by zt974 on 15-Nov-16.
 */
@Builder
@ToString
@Getter
public class Visit {
    private LocalDate date;
    private String description;
    private double cost;
    private People veterinary;
    @Singular
    private List<Pet> pets;
}
