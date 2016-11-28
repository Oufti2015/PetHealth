package ouftix.pet.health.gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.Setter;
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

    @Setter
    private Stage dialogStage;
    private PetModel petModel;
    private boolean okClicked = false;

    @FXML
    public void initialize() {
	System.out.println("PetDetailController nameTextField = " + nameTextField);
	System.out.println("PetDetailController this = " + this);
    }

    public void setPet(PetModel pet) {
	this.petModel = pet;
	System.out.println("Pet = " + pet + " " + pet.getName());

	nameTextField.setText(petModel.getName());
	officialNameTextField.setText(officialNameTextField.getText());
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

    /**
     * Returns true if the user clicked OK, false otherwise.
     * 
     * @return
     */
    public boolean isOkClicked() {
	return okClicked;
    }

    /**
     * Called when the user clicks ok.
     */
    @FXML
    private void handleOk() {
	if (isInputValid()) {
	    petModel.birthDay().set(birthDatePicker.getValue());
	    petModel.breed().set(breedComboBox.getValue());
	    petModel.deathDay().set(deathDatePixker.getValue());
	    petModel.name().set(nameTextField.getText());
	    petModel.officialName().set(officialNameTextField.getText());
	    petModel.petType().set(typeComboBox.getValue());

	    okClicked = true;
	    dialogStage.close();
	}
    }

    /**
     * Called when the user clicks cancel.
     */
    @FXML
    private void handleCancel() {
	dialogStage.close();
    }

    /**
     * Validates the user input in the text fields.
     * 
     * @return true if the input is valid
     */
    private boolean isInputValid() {
	// String errorMessage = "";
	//
	// if (firstNameField.getText() == null ||
	// firstNameField.getText().length() == 0) {
	// errorMessage += "No valid first name!\n";
	// }
	// if (lastNameField.getText() == null ||
	// lastNameField.getText().length() == 0) {
	// errorMessage += "No valid last name!\n";
	// }
	// if (streetField.getText() == null || streetField.getText().length()
	// == 0) {
	// errorMessage += "No valid street!\n";
	// }
	//
	// if (postalCodeField.getText() == null ||
	// postalCodeField.getText().length() == 0) {
	// errorMessage += "No valid postal code!\n";
	// } else {
	// // try to parse the postal code into an int
	// try {
	// Integer.parseInt(postalCodeField.getText());
	// } catch (NumberFormatException e) {
	// errorMessage += "No valid postal code (must be an integer)!\n";
	// }
	// }
	//
	// if (cityField.getText() == null || cityField.getText().length() == 0)
	// {
	// errorMessage += "No valid city!\n";
	// }
	//
	// if (birthdayField.getText() == null ||
	// birthdayField.getText().length() == 0) {
	// errorMessage += "No valid birthday!\n";
	// } else {
	// if (!CalendarUtil.validString(birthdayField.getText())) {
	// errorMessage += "No valid birthday. Use the format yyyy-mm-dd!\n";
	// }
	// }
	//
	// if (errorMessage.length() == 0) {
	// return true;
	// } else {
	// // Show the error message
	// Dialogs.showErrorDialog(dialogStage, errorMessage,
	// "Please correct invalid fields", "Invalid Fields");
	// return false;
	// }
	return true;
    }
}
