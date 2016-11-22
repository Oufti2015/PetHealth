package ouftix.pet.health.model.container;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import ouftix.pet.health.model.People;
import ouftix.pet.health.model.Pet;

public class PetHealthContainer {
    private static PetHealthContainer instance = null;

    static {
	instance = new PetHealthContainer();
    }

    public static PetHealthContainer me() {
	return instance;
    }

    private PetHealthContainer() {
    }

    @Getter
    private List<Pet> pets = new ArrayList<>();

    @Getter
    private List<People> peoples = new ArrayList<>();
}
