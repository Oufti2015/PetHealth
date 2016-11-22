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

    public void setPet(PetModel pet) {
    }
}
