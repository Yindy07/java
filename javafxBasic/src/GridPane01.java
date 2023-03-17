import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPane01 extends Application {

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
		
		Button loginBtn = new Button("로그인");
		Button cancelBtn = new Button("취소");
		loginBtn.setPrefSize(100, 30);
		cancelBtn.setPrefSize(100, 30);
		
		
		FlowPane flow = new FlowPane(); //입력할 때 출력할 때 병합할 때 쓴다
		flow.getChildren().addAll(loginBtn, cancelBtn);
		flow.setAlignment(Pos.CENTER);
		flow.setHgap(50);
		
		
		GridPane.setConstraints(labelId, 0, 0);
		GridPane.setConstraints(labelPw, 0, 1);
		
		GridPane.setConstraints(id, 1, 0);
		GridPane.setConstraints(pw, 1, 1);
		
		GridPane.setConstraints(flow, 0, 2, 2, 1); //0행의 컬럼에 2번째, 2개의 컬럼을 한개로(변수,좌우,상하,열병합,행병합)
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(labelId, labelPw, id, pw, flow);
		grid.setAlignment(Pos.CENTER); // 센터정렬
		grid.setHgap(40); //컬럼끼리 갭을 준다 수평
		grid.setVgap(20); //수직 갭을 준다
		grid.setPadding(new Insets(50, 0, 0, 30)); // top right bottom left
		
		primaryStage.setScene(new Scene(grid, 400, 400));
		primaryStage.show();
	}

}
