package ex2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Ex3Controller implements Initializable{ //컨트롤러는 이니셜라이제블을 항상 상속받아 사용한다
		
		@FXML TextField Id; //어노테이션  : 아이디랑 같은 변수명을 만든다. 룩업의 기능
		@FXML PasswordField Pw;
		@FXML Button login;
		
		public void loginButton(){
			System.out.println("id : " + Id.getText());
			System.out.println("pw : " + Pw.getText());
			//System.out.println("click");
		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
}
