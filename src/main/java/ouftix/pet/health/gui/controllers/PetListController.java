package ouftix.pet.health.gui.controllers;

import java.io.IOException;
import java.time.LocalDate;

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
import ouftix.pet.health.gui.models.PetModel;
import ouftix.pet.health.model.Pet.PetType;
import ouftix.pet.health.model.container.PetHealthContainer;

public class PetListController {
    @FXML
    private TableView<PetModel> petTableView;
    @FXML
    private TableColumn<PetModel, String> idColumn;
    @FXML
    private TableColumn<PetModel, String> nameColumn;
    @FXML
    private TableColumn<PetModel, String> officialNameColumn;
    @FXML
    private TableColumn<PetModel, String> breedColumn;
    @FXML
    private TableColumn<PetModel, PetType> petTypeColumn;
    @FXML
    private TableColumn<PetModel, LocalDate> birthDayColumn;
    @FXML
    private TableColumn<PetModel, LocalDate> deathDayColumn;
    @FXML
    private Button modifyButton;
    @FXML
    private Button removeButton;

    @FXML
    public void initialize() {
	System.out.println("petTableView = " + petTableView);

	idColumn.setCellValueFactory(new PropertyValueFactory<PetModel, String>("id"));
	nameColumn.setCellValueFactory(new PropertyValueFactory<PetModel, String>("name"));
	officialNameColumn.setCellValueFactory(new PropertyValueFactory<PetModel, String>("officialName"));
	breedColumn.setCellValueFactory(new PropertyValueFactory<PetModel, String>("breed"));
	petTypeColumn.setCellValueFactory(new PropertyValueFactory<PetModel, PetType>("petType"));
	birthDayColumn.setCellValueFactory(new PropertyValueFactory<PetModel, LocalDate>("birthDay"));
	deathDayColumn.setCellValueFactory(new PropertyValueFactory<PetModel, LocalDate>("deathDay"));

	ObservableList<PetModel> petData = FXCollections.observableArrayList();
	PetHealthContainer.me().getPets()
		.stream()
		.map(p -> new PetModel(p))
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
	PetModel pet = petTableView.getSelectionModel().getSelectedItem();
	System.out.println("PetListController " + pet.getName());
	openPetDialog(pet);
    }

    private void openPetDialog(PetModel pet) {
	try {
	    FXMLLoader loader = null;
	    loader = new FXMLLoader();
	    loader.setLocation(PetHealth.class.getResource(PetHealth.VIEWS_PET_DETAIL_VIEW_FXML));
	    Parent root = loader.load();

	    Stage stage = new Stage();
	    stage.setTitle("Ajouter/Modifier un animal...");
	    stage.setScene(new Scene(root, 450, 450));
	    stage.show();

	    PetDetailController controller = loader.getController();
	    if (pet != null) {
		controller.setPet(pet);
	    }
	    System.out.println("PetListController controller = " + controller);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
