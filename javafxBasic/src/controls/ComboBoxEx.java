package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComboBoxEx extends Application{

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		ComboBox<String> combo = new ComboBox<>();
		combo.getItems().addAll("멍때리기", "침대와 혼연일체", "축구는 눈으로만 시청하기");
		combo.setValue("선택"); // 처음 보여줄 화면 지정
		
		HBox box= new HBox();
		box.getChildren().add(combo);
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("ComboBoxEx");
		primaryStage.setScene(new Scene(box, 400, 100));
		primaryStage.show();
	}
}
