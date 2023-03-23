package ex2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Quiz1Controller implements Initializable{ //컨트롤러는 이니셜라이제블을 항상 상속받아 사용한다
		
		@FXML TextField Id; //어노테이션  : 아이디랑 같은 변수명을 만든다. 룩업의 기능
		@FXML PasswordField Pw;
		@FXML Button login;
		String id = "admin";
		String pw = "1234";
		public void loginButton(){
			Alert alert;
			alert = new Alert(AlertType.WARNING);
			alert.setHeaderText("알림");
			if(Id.getText().isEmpty()) 
				alert.setContentText("아이디를 입력하세요.");
			else if (Pw.getText().isEmpty()) 
				alert.setContentText("비밀번호를 입력하세요.");
			
			else if(id.equals(Id.getText()) && pw.equals(Pw.getText())) {
				alert = new Alert(AlertType.INFORMATION);
				alert.setHeaderText("성공");
				alert.setContentText("로그인 성공");
			}
			else {
				alert = new Alert(AlertType.ERROR);
				alert.setHeaderText("에러");
				alert.setContentText("로그인 실패");
			}
			alert.show();
		}
		public void focus() {
			Id.clear();
			Pw.clear();
		}
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
}
