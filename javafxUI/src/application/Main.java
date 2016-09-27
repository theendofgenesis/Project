package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application  {
	Button button;

	Stage window;

	Scene scene1, scene2;

	@Override
	public void start(Stage primaryStage) {
		try {

			window = primaryStage;

			window.setTitle("University of South Alabama SoC Academic Adivising Helper");


	        //Layout 1 - children laid out in horizontal column

	        VBox centerBox = new VBox(20);
	        HBox topBox = new HBox(20);

	        //Buttons
	        Button submitButton = new Button("Submit");


	        Label nameTitle = new Label("USA SoC Academic Planner");

	        Label nameLabel = new Label("Student Name");
	        TextField textName = new TextField();
	       textName.setId("textName");
	       

	        Label nameJnum = new Label("Student J Number");
	        TextField textJnum = new TextField();
	       textJnum.setId("textName");


	        centerBox.getChildren().addAll(nameLabel, textName, nameJnum, textJnum, submitButton);
	        topBox.getChildren().add(nameTitle);

	        BorderPane borderPane = new BorderPane();
	        borderPane.setCenter(centerBox);
	        borderPane.setTop(topBox);

	        centerBox.setAlignment(Pos.CENTER);

	        scene1 = new Scene(borderPane, 600, 400);

	        scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());



	        //Display scene 1 at first
	        window.setScene(scene1);
	        window.show();


		} catch(Exception e) {
			e.printStackTrace();
		}
	}




	public static void main(String[] args) {
		launch(args);
	}
}
