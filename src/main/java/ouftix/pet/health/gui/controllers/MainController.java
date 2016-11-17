package ouftix.pet.health.gui.controllers;

import javafx.fxml.FXML;

public class MainController {
    @FXML
    private PetListController petListController;
    @FXML
    private PetDetailController petDetailController;
    @FXML
    private PeopleController peopleController;

    @FXML
    public void initialize() {
	System.out.println("petListController   = " + petListController);
	System.out.println("petDetailController = " + petDetailController);
	System.out.println("peopleController    = " + peopleController);
    }
}
