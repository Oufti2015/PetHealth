package ouftix.pet.health.gui.controllers;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ouftix.pet.health.gui.PetHealth;
import ouftix.pet.health.gui.models.PeopleModel;
import ouftix.pet.health.model.container.PetHealthContainer;

public class PeopleListController {
    @FXML
    private TableView<PeopleModel> peopleTableView;
    @FXML
    private TableColumn<PeopleModel, String> firstNameColumn;
    @FXML
    private TableColumn<PeopleModel, String> lastNameColumn;
    @FXML
    private TableColumn<PeopleModel, String> professionColumn;
    @FXML
    private Button modifyButton;
    @FXML
    private Button removeButton;

    @FXML
    public void initialize() {
	System.out.println("peopleTableView = " + peopleTableView);

	firstNameColumn.setCellValueFactory(new PropertyValueFactory<PeopleModel, String>("firstName"));
	lastNameColumn.setCellValueFactory(new PropertyValueFactory<PeopleModel, String>("lastName"));
	professionColumn.setCellValueFactory(new PropertyValueFactory<PeopleModel, String>("profession"));

	ObservableList<PeopleModel> peopleData = FXCollections.observableArrayList();
	PetHealthContainer.me().getPeoples()
		.stream()
		.map(p -> new PeopleModel(p))
		.forEach(p2 -> peopleData.add(p2));
	peopleTableView.setItems(peopleData);
	modifyButton.disableProperty().bind(peopleTableView.getSelectionModel().selectedItemProperty().isNull());
	removeButton.disableProperty().bind(peopleTableView.getSelectionModel().selectedItemProperty().isNull());
    }

    @FXML
    public void onAddButton() {
	System.out.println("PetListController onAddButton");
	openPetDialog(null);
    }

    @FXML
    public void onModifyButton() {
	System.out.println("PetListController onModifyButton");
	PeopleModel people = peopleTableView.getSelectionModel().getSelectedItem();
	openPetDialog(people);
    }

    private void openPetDialog(PeopleModel people) {
	try {
	    FXMLLoader loader = null;
	    loader = new FXMLLoader();
	    loader.setLocation(PetHealth.class.getResource(PetHealth.VIEWS_PEOPLE_DETAIL_VIEW_FXML));
	    loader.load();
	    /*
	     * PetDetailController controller = loader.getController(); if
	     * (people != null) { controller.setPet(people); }
	     */
	    Parent root = FXMLLoader.load(PetHealth.class.getResource(PetHealth.VIEWS_PEOPLE_DETAIL_VIEW_FXML));
	    Stage stage = new Stage();
	    stage.setTitle("Ajouter/Modifier une personne...");
	    stage.setScene(new Scene(root, 450, 450));
	    stage.show();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
