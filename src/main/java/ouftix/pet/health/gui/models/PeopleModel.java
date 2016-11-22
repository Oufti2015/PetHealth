package ouftix.pet.health.gui.models;

import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import ouftix.pet.health.model.Address;
import ouftix.pet.health.model.Email;
import ouftix.pet.health.model.People;
import ouftix.pet.health.model.Phone;

public class PeopleModel {
    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty profession;
    private ObjectProperty<Address> address;
    private ObjectProperty<List<Phone>> phones;
    private ObjectProperty<List<Email>> emails;

    public PeopleModel(People people) {
	this.firstName = new SimpleStringProperty(people.getFirstName());
	this.lastName = new SimpleStringProperty(people.getLastName());
	this.profession = new SimpleStringProperty(people.getProfession());
	this.address = new SimpleObjectProperty<Address>(people.getAddress());
	this.phones = new SimpleObjectProperty<List<Phone>>(people.getPhones());
	this.emails = new SimpleObjectProperty<List<Email>>(people.getEmails());
    }

    public StringProperty firstName() {
	return firstName;
    }

    public StringProperty lastName() {
	return lastName;
    }

    public StringProperty profession() {
	return profession;
    }

    public ObjectProperty<Address> address() {
	return address;
    }

    public ObjectProperty<List<Phone>> phones() {
	return phones;
    }

    public ObjectProperty<List<Email>> emails() {
	return emails;
    }

    public String getFirstName() {
	return firstName.get();
    }

    public String getLastName() {
	return lastName.get();
    }

    public String getProfession() {
	return profession.get();
    }

    public Address getAddress() {
	return address.get();
    }

    public List<Phone> getPhones() {
	return phones.get();
    }

    public List<Email> getEmails() {
	return emails.get();
    }
}
