package ouftix.pet.health.gui.controllers;

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import ouftix.pet.health.gui.models.PetModel;
import ouftix.pet.health.gui.models.VisitModel;
import ouftix.pet.health.model.People;
import ouftix.pet.health.model.container.PetHealthContainer;

public class VisitListController {
    @FXML
    private TableView<VisitModel> visitTableView;
    @FXML
    private TableColumn<VisitModel, LocalDate> dateColumn;
    @FXML
    private TableColumn<VisitModel, String> descriptionColumn;
    @FXML
    private TableColumn<VisitModel, Double> costColumn;
    @FXML
    private TableColumn<VisitModel, People> veterinaryColumn;
    @FXML
    private Button modifyButton;
    @FXML
    private Button removeButton;

    @FXML
    public void initialize() {
	System.out.println("visitTableView = " + visitTableView);

	dateColumn.setCellValueFactory(new PropertyValueFactory<VisitModel, LocalDate>("date"));
	descriptionColumn.setCellValueFactory(new PropertyValueFactory<VisitModel, String>("description"));
	costColumn.setCellValueFactory(new PropertyValueFactory<VisitModel, Double>("cost"));
	veterinaryColumn.setCellValueFactory(new PropertyValueFactory<VisitModel, People>("veterinary"));

	ObservableList<VisitModel> visitData = FXCollections.observableArrayList();
	PetHealthContainer.me().getVisits()
		.stream()
		.map(p -> new VisitModel(p))
		.forEach(p2 -> visitData.add(p2));
	visitTableView.setItems(visitData);
	modifyButton.disableProperty().bind(visitTableView.getSelectionModel().selectedItemProperty().isNull());
	removeButton.disableProperty().bind(visitTableView.getSelectionModel().selectedItemProperty().isNull());
    }

    @FXML
    public void onAddButton() {
	System.out.println("PetListController onAddButton");
	openPetDialog(null);
    }

    @FXML
    public void onModifyButton() {
	System.out.println("PetListController onModifyButton");
	VisitModel pet = visitTableView.getSelectionModel().getSelectedItem();
	// openPetDialog(pet);
    }

    private void openPetDialog(PetModel pet) {
	// try {
	// FXMLLoader loader = null;
	// loader = new FXMLLoader();
	// loader.setLocation(PetHealth.class.getResource(PetHealth.VIEWS_PET_DETAIL_VIEW_FXML));
	// loader.load();
	// PetDetailController controller = loader.getController();
	// if (pet != null) {
	// controller.setPet(pet);
	// }
	//
	// Parent root =
	// FXMLLoader.load(PetHealth.class.getResource(PetHealth.VIEWS_PET_DETAIL_VIEW_FXML));
	// Stage stage = new Stage();
	// stage.setTitle("Ajouter/Modifier un animal...");
	// stage.setScene(new Scene(root, 450, 450));
	// stage.show();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
    }

}
