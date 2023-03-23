package ex2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Quiz1 extends Application{
	@SuppressWarnings("unused")
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Quiz1.fxml"));//load = 인스턴스로 만들어 준다
		Parent form = loader.load(); 				//parent메서드에 참조변수 form에 로드
//		Ex2Controller con = loader.getController(); //컨트롤러의 참조값을 얻어 올 수 있다. 자료형은 object이므로 원하는 대로 사용 
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("Quiz1");
		primaryStage.show();
		
	}
public static void main(String[] args) {
		
		launch(args);
	}

}