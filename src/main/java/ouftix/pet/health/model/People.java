package ouftix.pet.health.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

/**
 * Created by zt974 on 15-Nov-16.
 */
@Builder
@Data
public class People {
    private String firstName;
    private String lastName;
    private String profession;
    private Address address;
    @Singular
    private List<Phone> phones = new ArrayList<>();
    @Singular
    private List<Email> emails = new ArrayList<>();

    @Override
    public String toString() {
	return firstName + " " + lastName;
    }
}
