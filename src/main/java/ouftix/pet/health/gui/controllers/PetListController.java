package ouftix.pet.health.gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import ouftix.pet.health.model.Pet;

public class PetListController {
    @FXML
    TableView<Pet> petTableView;

    @FXML
    public void initialize() {
	System.out.println("petTableView = " + petTableView);
    }

}
