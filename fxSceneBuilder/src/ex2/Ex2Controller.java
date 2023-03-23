package ex2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Ex2Controller implements Initializable{ //컨트롤러는 이니셜라이제블을 항상 상속받아 사용한다
		
		@FXML TextField Id; //어노테이션  : 아이디랑 같은 변수명을 만든다. 룩업의 기능
		@FXML PasswordField Pw;
		@FXML Button login;
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
//			TextField Id = (TextField)form.lookup("#Id"); //lookup:식별자 찾겠다
//			PasswordField Pw = (PasswordField)form.lookup("#Pw");
//			Button login = (Button)form.lookup("#login");
			
			login.setOnMouseClicked((e) ->{
				String id = Id.getText();
				String pw = Pw.getText();
				System.out.println("id : " + id);
				System.out.println("pw : " + pw);
			});
			
			
			
		}
//		public void click()
//		{
//			System.out.println("click");
//		}
}
