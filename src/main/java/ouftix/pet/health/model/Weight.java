package ouftix.pet.health.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Weight {
    private Pet pet;
    private LocalDate date;
    private Double weight;
}
