package events;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("Values");
		label.setFont(new Font("Lucida Console", 30));
		label.setRotate(-90);
		
		Label label2 = new Label("A label that needs to be wrapped");
		label2.setFont(new Font(15));
		label2.setWrapText(true);
		label2.setPrefSize(100, 100);
		
		
		
		Label iv = new Label("Search", new ImageView("/img/search.png"));
		iv.setFont(new Font(20));
		iv.setTextFill(Color.BLUE);
		
		
		label.setOnMouseEntered(
			(e) ->{
				label.setScaleX(2);
				label.setScaleY(2);
			}
		);
		label.setOnMouseExited(
		(e) ->{
			label.setScaleX(1);
			label.setScaleY(1);
		}
		);
		
		label2.setOnMouseEntered(
				(e) ->{
					label2.setScaleX(2);
					label2.setScaleY(2);
				}
			);
		label2.setOnMouseExited(
			(e) ->{
				label2.setScaleX(1);
				label2.setScaleY(1);
			}
			);
			
		iv.setOnMouseEntered(
					(e) ->{
						iv.setScaleX(2);
						iv.setScaleY(2);
					}
				);
		iv.setOnMouseExited(
				(e) ->{
					iv.setScaleX(1);
					iv.setScaleY(1);
				}
				);
		
		HBox box = new HBox();
		box.getChildren().addAll(iv, label, label2);
		box.setSpacing(20);
		box.setAlignment(Pos.CENTER);
		primaryStage.setScene(new Scene(box, 400, 300));
		primaryStage.setTitle("EventEx3");
		primaryStage.show();
	}

}
