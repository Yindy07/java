package events;



import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EventEx01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

//	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("click");
		label.setFont(new Font(24));
		label.setLayoutX(120);
		label.setLayoutY(80);	
		label.setOnMouseEntered(new EventHandler<Event>() { //<Event> 최상위 제너릭 ==   MouseEvent

			@Override
			public void handle(Event event) {
				System.out.println("레이블 위에 마우스 포인터가 있다");
				label.setFont(new Font(40));
				label.setLayoutX(120);
				label.setLayoutY(80);
			}
		});
		label.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				label.setFont(new Font(24));
				label.setLayoutX(120);
				label.setLayoutY(80);
			}
		});
//		EventHandler<Event> eh = (e) ->{
//			System.out.println("마우스 온");
//		};
		//label.setOnMouseEntered(eh);
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().add(label);
		primaryStage.setScene(new Scene(anchor, 400, 200));
		primaryStage.setTitle("EventEx01");
		primaryStage.show();
	}

}
