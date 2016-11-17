package ouftix.pet.health.gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import ouftix.pet.health.model.Weight;

public class WeightsController {
    @FXML
    private TableView<Weight> weightTableView;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField weightTextField;
    @FXML
    private Button addButton;
    @FXML
    private Button removeButton;
    @FXML
    private Button updateButton;
}
