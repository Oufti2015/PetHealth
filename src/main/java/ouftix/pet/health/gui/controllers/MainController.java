package ouftix.pet.health.gui.controllers;

import javafx.fxml.FXML;

public class MainController {

    @FXML
    private PetListController petListController;

    @FXML
    public void initialize() {
	System.out.println("petListController = " + petListController);
    }
}
