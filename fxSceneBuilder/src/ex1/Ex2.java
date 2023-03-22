package ex1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex2 extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		

		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex2.fxml"));//load = 인스턴스로 만들어 준다
		Parent form = loader.load(); 				//parent메서드에 참조변수 form에 로드
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex2");
		primaryStage.show();
		
	}

}
