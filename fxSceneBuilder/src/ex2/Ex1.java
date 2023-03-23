package ex2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Ex1 extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex1.fxml"));//load = 인스턴스로 만들어 준다
		Parent form = loader.load(); 				//parent메서드에 참조변수 form에 로드
		
		TextField Id = (TextField)form.lookup("#Id"); //lookup:식별자 찾겠다
		PasswordField Pw = (PasswordField)form.lookup("#Pw");
		Button login = (Button)form.lookup("#login");
		
		
		login.setOnMouseClicked((e) ->{
			String id = Id.getText();
			String pw = Pw.getText();
			System.out.println("id : " + id);
			System.out.println("pw : " + pw);
		});
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex1");
		primaryStage.show();
		
	}

}
