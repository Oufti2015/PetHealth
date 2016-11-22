package ouftix.pet.health.gui.models;

import java.time.LocalDate;
import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import ouftix.pet.health.model.People;
import ouftix.pet.health.model.Pet;
import ouftix.pet.health.model.Visit;

public class VisitModel {
    private ObjectProperty<LocalDate> date;
    private StringProperty description;
    private ObjectProperty<Double> cost;
    private ObjectProperty<People> veterinary;
    private ObjectProperty<List<Pet>> pets;

    public VisitModel(Visit visit) {
	this.date = new SimpleObjectProperty<LocalDate>(visit.getDate());
	this.description = new SimpleStringProperty(visit.getDescription());
	this.cost = new SimpleObjectProperty<Double>(visit.getCost());
	this.veterinary = new SimpleObjectProperty<People>(visit.getVeterinary());
	this.pets = new SimpleObjectProperty<List<Pet>>(visit.getPets());
    }

    public ObjectProperty<LocalDate> date() {
	return date;
    }

    public StringProperty description() {
	return description;
    }

    public ObjectProperty<Double> cost() {
	return cost;
    }

    public ObjectProperty<People> veterinary() {
	return veterinary;
    }

    public ObjectProperty<List<Pet>> pets() {
	return pets;
    }

    public LocalDate getDate() {
	return date.get();
    }

    public String getDescription() {
	return description.get();
    }

    public Double getCost() {
	return cost.get();
    }

    public People getVeterinary() {
	return veterinary.get();
    }

    public List<Pet> getPets() {
	return pets.get();
    }
}
