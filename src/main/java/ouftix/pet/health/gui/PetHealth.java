package ouftix.pet.health.gui;/**
			       * Created by zt974 on 15-Nov-16.
			       */

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetHealth extends Application {
    private static final String VIEWS_MAIN_FXML = "views/Main.fxml";
    Stage primaryStage;
    GridPane rootLayout;

    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

	// set title
	this.primaryStage = primaryStage;
	primaryStage.setTitle("Oufti Bank");

	// scene.getStylesheets().add(OuftiBankFX.class.getResource("sigillo.css").toExternalForm());

	// init(grid);

	initRootLayout();

    }

    private void initRootLayout() {
	try {
	    // Load root layout from fxml file.
	    FXMLLoader loader = null;
	    loader = new FXMLLoader();
	    loader.setLocation(PetHealth.class.getResource(VIEWS_MAIN_FXML));
	    rootLayout = (GridPane) loader.load();

	    ouftix.pet.health.gui.controllers.MainController controller = loader.getController();
	    // controller.setOwner(this);

	    // Show the scene containing the root layout.
	    Scene scene = new Scene(rootLayout);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	} catch (IOException e) {
	    System.err.println("Cannot load " + VIEWS_MAIN_FXML + " : " + e);
	    e.printStackTrace();
	}
    }
}