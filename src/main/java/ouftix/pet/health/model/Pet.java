package ouftix.pet.health.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

/**
 * Created by zt974 on 15-Nov-16.
 */
@ToString
@Builder
public class Pet {
    private String id;
    private String name;
    private String officialName;
    private PetType petType;
    private LocalDate birthDay;
    private LocalDate deathDay;
    @Singular
    private List<Double> weights;

    public enum PetType {
	DOG, CAT
    }
}
