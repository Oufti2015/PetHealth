package ouftix.pet.health.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;
import ouftix.pet.health.gui.controllers.PetDetailController;
import ouftix.pet.health.gui.models.PetModel;

public class PetDetailsDialog extends Dialog<PetModel> {

    public PetDetailsDialog(PetModel pet) {
	// Create the custom dialog.
	this.setTitle("Détail d'un animal");
	this.setHeaderText("Ajouter/Modifier un animal...");

	// Set the icon (must be included in the project).
	// this.setGraphic(new
	// ImageView(this.getClass().getResource("login.png").toString()));

	// Set the button types.
	ButtonType loginButtonType = new ButtonType("Login", ButtonData.OK_DONE);
	this.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

	try {
	    FXMLLoader loader = null;
	    loader = new FXMLLoader();
	    loader.setLocation(PetHealth.class.getResource(PetHealth.VIEWS_PET_DETAIL_VIEW_FXML));
	    Parent root = loader.load();

	    // Get the Stage.
	    Stage stage = (Stage) this.getDialogPane().getScene().getWindow();
	    Scene scene = this.getDialogPane().getScene();
	    scene.setRoot(root);

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
