package ex1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex1 extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		System.out.println("현재 클래스 : " + getClass());
		System.out.println("어떤 대상의 위치 : " + getClass().getResource("ex1.fxml"));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex1.fxml"));//load = 인스턴스로 만들어 준다
		Parent form = loader.load(); 				//parent메서드에 참조변수 form에 로드
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex1");
		primaryStage.show();
		
	}

}
