package ouftix.pet.health.gui.controllers;

import javafx.fxml.FXML;

public class MainController {
    @FXML
    private PetListController petListController;
    @FXML
    private PeopleListController peopleListController;
    @FXML
    private VisitListController visitListController;

    @FXML
    public void initialize() {
	System.out.println("petListController    = " + petListController);
	System.out.println("peopleListController = " + peopleListController);
	System.out.println("visitListController  = " + visitListController);
    }
}
