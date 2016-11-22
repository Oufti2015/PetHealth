package ouftix.pet.health.gui.controllers;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import ouftix.pet.health.gui.PetHealth;
import ouftix.pet.health.gui.models.ObservablePet;
import ouftix.pet.health.model.container.PetHealthContainer;

public class PetListController {
    @FXML
    private TableView<ObservablePet> petTableView;
    @FXML
    private Button modifyButton;
    @FXML
    private Button removeButton;

    @FXML
    public void initialize() {
	System.out.println("petTableView = " + petTableView);
	ObservableList<ObservablePet> petData = FXCollections.observableArrayList();
	PetHealthContainer.me().getPets()
		.stream()
		.map(p -> new ObservablePet(p))
		.forEach(p2 -> petData.add(p2));
	petTableView.setItems(petData);
	modifyButton.disableProperty().bind(petTableView.getSelectionModel().selectedItemProperty().isNull());
	removeButton.disableProperty().bind(petTableView.getSelectionModel().selectedItemProperty().isNull());
    }

    @FXML
    public void onAddButton() {
	System.out.println("PetListController onAddButton");
	openPetDialog(null);
    }

    @FXML
    public void onModifyButton() {
	System.out.println("PetListController onModifyButton");
	ObservablePet pet = petTableView.getSelectionModel().getSelectedItem();
	openPetDialog(pet);
    }

    private void openPetDialog(ObservablePet pet) {
	try {
	    FXMLLoader loader = null;
	    loader = new FXMLLoader();
	    loader.setLocation(PetHealth.class.getResource(PetHealth.VIEWS_PET_DETAIL_VIEW_FXML));
	    loader.load();
	    PetDetailController controller = loader.getController();
	    controller.setPet(pet);

	    // MainController controller = loader.getController();
	    // root =
	    // FXMLLoader.load(PetHealth.class.getResource(PetHealth.VIEWS_PET_DETAIL_VIEW_FXML));
	    // Stage stage = new Stage();
	    // stage.setTitle("My New Stage Title");
	    // stage.setScene(new Scene(root, 450, 450));
	    // stage.show();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
