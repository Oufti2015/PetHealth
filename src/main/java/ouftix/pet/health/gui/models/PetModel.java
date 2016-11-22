package ouftix.pet.health.gui.models;

import java.time.LocalDate;
import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import ouftix.pet.health.model.Pet.PetType;

public class PetModel {
    private StringProperty id;
    private StringProperty name;
    private StringProperty officialName;
    private StringProperty breed;
    private ObjectProperty<PetType> petType;
    private ObjectProperty<LocalDate> birthDay;
    private ObjectProperty<LocalDate> deathDay;
    private ObjectProperty<List<Double>> weights;

    public PetModel(ouftix.pet.health.model.Pet pet) {
	this.id = new SimpleStringProperty(pet.getId());
	this.name = new SimpleStringProperty(pet.getName());
	this.officialName = new SimpleStringProperty(pet.getOfficialName());
	this.breed = new SimpleStringProperty(pet.getBreed());
	this.petType = new SimpleObjectProperty<PetType>(pet.getPetType());
	this.birthDay = new SimpleObjectProperty<LocalDate>(pet.getBirthDay());
	this.deathDay = new SimpleObjectProperty<LocalDate>(pet.getDeathDay());
	this.weights = new SimpleObjectProperty<List<Double>>(pet.getWeights());
    }

    public StringProperty id() {
	return id;
    }

    public StringProperty name() {
	return name;
    }

    public StringProperty officialName() {
	return officialName;
    }

    public StringProperty breed() {
	return breed;
    }

    public ObjectProperty<PetType> petType() {
	return petType;
    }

    public ObjectProperty<LocalDate> birthDay() {
	return birthDay;
    }

    public ObjectProperty<LocalDate> deathDay() {
	return deathDay;
    }

    public ObjectProperty<List<Double>> weights() {
	return weights;
    }

    public String getId() {
	return id.get();
    }

    public String getName() {
	return name.get();
    }

    public String getOfficialName() {
	return officialName.get();
    }

    public String getBreed() {
	return breed.get();
    }

    public PetType getPetType() {
	return petType.get();
    }

    public LocalDate getBirthDay() {
	return birthDay.get();
    }

    public LocalDate getDeathDay() {
	return deathDay.get();
    }

    public List<Double> getWeights() {
	return weights.get();
    }
}
