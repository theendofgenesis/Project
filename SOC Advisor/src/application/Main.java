//SOC advisor package
package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
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
	        Button nextButton = new Button("Next");


	        //Image


	        //Scene 1

	        //Layout 1
	        VBox centerBox = new VBox(20);
	        HBox topBox = new HBox(20);

	        BorderPane borderPane = new BorderPane();
	        borderPane.setCenter(centerBox);
	        borderPane.setTop(topBox);

	        scene1 = new Scene(borderPane, 600, 400);

	        // attach CSS file to first scene
	        scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());


	        Student student1 = new Student("name", "J00000000", 000000, null, false, null, null);

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
	        submitButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

					student1.setName(textName.getText());
					student1.setJnumber(textJnum.getText());
					window.setScene(scene2);
					student1.toString();
				}

	        });



	        //scene 2

	      //Layout 2
	        HBox HcenterBox2 = new HBox(20);
	        HBox HtopBox2 = new HBox(20);
	        HBox HbottomBox2 = new HBox(20);

	        BorderPane borderPane2 = new BorderPane();
	        borderPane2.setCenter(HcenterBox2);
	        borderPane2.setTop(HtopBox2);
	        borderPane2.setBottom(HbottomBox2);

	        //alignment
	        HbottomBox2.setAlignment(Pos.BOTTOM_RIGHT);
	        HbottomBox2.setPadding(new Insets(20,20,20,20));

	        BorderPane.setAlignment(borderPane2, Pos.CENTER);

	        //declare scene
	        scene2 = new Scene(borderPane2, 600, 400);
	        //declare css file for scene
	        scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

	        Label focusLabel = new Label("What is your Course?");


	        //catalog radio buttons
	        ToggleGroup trackgroup = new ToggleGroup();
	        RadioButton CSCtrack = new RadioButton("CSC");
	        CSCtrack.setToggleGroup(trackgroup);
	        CSCtrack.setSelected(true);
	        RadioButton ITtrack = new RadioButton("IT");
	        ITtrack.setToggleGroup(trackgroup);
	        RadioButton IStrack = new RadioButton("IS");
	        IStrack.setToggleGroup(trackgroup);


	        //apply menu elements
	        HtopBox2.getChildren().addAll(nameTitle);
	        HcenterBox2.getChildren().addAll(focusLabel, CSCtrack, ITtrack, IStrack);
	        HbottomBox2.getChildren().addAll(nextButton);



	        //submit button
	        nextButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

					window.setScene(scene3);

				}

	        });


	        //scene 3

	        //Layout 3
	        VBox centerBox3 = new VBox(20);
	        HBox topBox3 = new HBox(20);

	        BorderPane borderPane3 = new BorderPane();
	        borderPane3.setCenter(centerBox3);
	        borderPane3.setTop(topBox3);

	        scene3 = new Scene(borderPane3, 600, 400);

	        scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());


	        Label reportLabel = new Label("Generated report goes here");


	        centerBox3.getChildren().addAll(reportLabel);



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
