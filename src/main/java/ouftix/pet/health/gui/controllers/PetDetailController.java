package ouftix.pet.health.gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import ouftix.pet.health.gui.models.PetModel;
import ouftix.pet.health.model.Pet.PetType;

public class PetDetailController {
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField officialNameTextField;
    @FXML
    private ComboBox<PetType> typeComboBox;
    @FXML
    private ComboBox<String> breedComboBox;
    @FXML
    private DatePicker birthDatePicker;
    @FXML
    private DatePicker deathDatePixker;
    @FXML
    private WeightsController weightsController;

    private PetModel petModel;

    @FXML
    public void initialize() {
	System.out.println("PetDetailController nameTextField = " + nameTextField);
	System.out.println("PetDetailController this = " + this);
    }

    public void setPet(PetModel pet) {
	this.petModel = pet;
	System.out.println("Pet = " + pet + " " + pet.getName());

	nameTextField.textProperty().bindBidirectional(pet.name());
	officialNameTextField.textProperty().bindBidirectional(pet.officialName());
	// pet.name().bind(nameTextField.textProperty());
	// nameTextField.setText("Hyuma");
	// officialNameTextField.setText("Hyuma de Chez Steph");
    }

    public void onOkButton() {
	System.out.println("PetDetailController #onOkButton");
	System.out.println("nameTextField.getText() " + nameTextField.getText());
	System.out.println("petModel.name() " + petModel.name());
	System.out.println("petModel.getName() " + petModel.getName());

	// officialNameTextField.setText(nameTextField.getText());
    }
}
