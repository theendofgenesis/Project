//SOC advisor package
package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import socProgram.Student;


public class Main extends Application  {
	Button button;

	Stage window;

	Scene scene1, scene2, scene3, scene4;

	@Override
	public void start(Stage primaryStage) {
		try {

			window = primaryStage;
			window.setTitle("University of South Alabama SoC Academic Adivising Helper");

			//Buttons
	        Button submitButton = new Button("Submit");

	        //Layout 1
	        VBox centerBox = new VBox(20);
	        HBox topBox = new HBox(20);

	        //Layout 2
	        VBox centerBox2 = new VBox(20);
	        HBox topBox2 = new HBox(20);

	        //Scene 1

	        BorderPane borderPane = new BorderPane();
	        borderPane.setCenter(centerBox);
	        borderPane.setTop(topBox);

	        scene1 = new Scene(borderPane, 600, 400);

	        // attach CSS file to first scene
	        scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());


	        Student student1 = new Student("name", 000000, 000000, null, false, null, null);

	        // scene 1 Header
	        Label nameTitle = new Label("USA SoC Academic Planner");

	        //Name field label
	        Label nameLabel = new Label("Student Name");
	        //Name field
	        TextField textName = new TextField();
	        //Name field for styling
	        textName.setId("textName");


	        //J number field label
	        Label nameJnum = new Label("Student J Number");
	        //J number field
	        TextField textJnum = new TextField();
	        //J number id for styling
	        textJnum.setId("textName");


	        //collect all elements and add them to centerBox
	        centerBox.getChildren().addAll(nameLabel, textName, nameJnum, textJnum, submitButton);
	        //collect all elements and add them to topBox
	        topBox.getChildren().add(nameTitle);

	        //center the elements in centerBox
	        centerBox.setAlignment(Pos.CENTER);





	        //submit button
	        submitButton.setOnAction(e -> student1.setName(textName.getText()));

	        //submitButton.setOnAction(e -> student1.toString());
	       // submitButton.setOnAction(e -> window.setScene(scene2));







	        //scene 2

	        BorderPane borderPane2 = new BorderPane();
	        borderPane2.setCenter(centerBox2);
	        borderPane2.setTop(topBox2);

	        scene2 = new Scene(borderPane2, 600, 400);

	        scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());


	        CheckBox box1 = new CheckBox("Box 1");
	        CheckBox box2 = new CheckBox("Box 2");



	        centerBox2.getChildren().addAll(nameTitle, box1, box2);




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
