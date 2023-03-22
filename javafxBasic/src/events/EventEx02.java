package events;



import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EventEx02 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("클릭");
		label.setFont(new Font(24));
		label.setLayoutX(120);
		label.setLayoutY(80);
		
		
		EventHandler<Event> eh = (e)->{
			label.setFont(new Font(40));
		};
		
		label.setOnMouseClicked(eh);
		
		eh = (e) ->{
			label.setFont(new Font(24));
		};
		label.setOnMouseExited(eh);
		
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().add(label);
		primaryStage.setScene(new Scene(anchor, 300, 200));
		primaryStage.setTitle("EventEx2");
		primaryStage.show();
	}

}
