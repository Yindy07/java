package events;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EventEx06 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label labelId = new Label("아이디");		//라벨 입력
		Label labelPw = new Label("비밀번호");

		TextField id = new TextField();			//텍스트 입력
		PasswordField pw = new PasswordField();
		id.setMaxWidth(200); // 사이즈 조절
		pw.setMaxWidth(200);
		String dbId = "admin";
		String dbPw = "1234";
		
		Button loginBtn = new Button("로그인");
		Button cancelBtn = new Button("취소");
		loginBtn.setPrefSize(100, 30);
		cancelBtn.setPrefSize(100, 30);
		
		loginBtn.setOnMouseClicked((e) ->{
			String userId = id.getText();	
			String userPw = pw.getText();
			
			if(userId.equals("") || userPw.equals("")){
				Alert alert = new Alert(AlertType.WARNING);
				alert.setHeaderText("경고");
				alert.setContentText("아이디와 비밀번호를 입력하세요");
				alert.show();
			}
			else if(dbId.equals(userId) && dbPw.equals(userPw)) {
				Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setHeaderText("성공");
				alert.setContentText("로그인 성공");
				alert.show();
			}
			else{
				Alert alert = new Alert(AlertType.ERROR);
				alert.setHeaderText("에러");
				alert.setContentText("아이디 또는 비밀번호가 다릅니다.");
				alert.show();
			}
		});
		
		cancelBtn.setOnMouseClicked((e) ->{
			id.clear();
			pw.clear();
		});
		FlowPane flow = new FlowPane(); //입력할 때 출력할 때 병합할 때 쓴다
		flow.getChildren().addAll(loginBtn, cancelBtn);
		flow.setAlignment(Pos.CENTER);
		flow.setHgap(50);
		
		
		GridPane.setConstraints(labelId, 0, 0);
		GridPane.setConstraints(labelPw, 0, 1);
		
		GridPane.setConstraints(id, 1, 0);
		GridPane.setConstraints(pw, 1, 1);
		
		GridPane.setConstraints(flow, 0, 2, 2, 1); //0행의 컬럼에 2번째, 2개의 컬럼을 한개로
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(labelId, labelPw, id, pw, flow);
		grid.setAlignment(Pos.CENTER); // 센터정렬
		grid.setHgap(50); //컬럼끼리 갭을 준다 수평
		grid.setVgap(30); //수직 갭을 준다
		grid.setPadding(new Insets(50));
		
		primaryStage.setScene(new Scene(grid, 400, 300));
		primaryStage.setTitle("EventEx5");
		primaryStage.show();
		
		
		
	}

}
