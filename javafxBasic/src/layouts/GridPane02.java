package layouts;
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

public class GridPane02 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label1 = new Label("아이디");		//라벨 입력
		Label label2 = new Label("비밀번호");

		TextField id = new TextField();			//텍스트 입력
		PasswordField pw = new PasswordField();
		
		GridPane.setConstraints(label1, 0, 0);
		GridPane.setConstraints(label2, 0, 1);
		
		GridPane.setConstraints(id, 1, 0);
		GridPane.setConstraints(pw, 1, 1);
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(label1, label2, id, pw);
		grid.setHgap(40); //컬럼끼리 갭을 준다 수평
		grid.setVgap(20); //수직 갭을 준다
		grid.setPadding(new Insets(50, 0, 0, 30)); // top right bottom left
		
		
		FlowPane flow = new FlowPane(); //입력할 때 출력할 때 병합할 때 쓴다
		flow.getChildren().add(new Button("Merge col(o) row(2)"));
		flow.setPrefSize(250, 20);
		flow.setStyle("-fx-background-color: #611E31");
		flow.setAlignment(Pos.CENTER);
		
		grid.add(flow, 0, 2, 2, 1);
		Scene scene = new Scene(grid, 300,200);
		
		primaryStage.setTitle("GridPaneEx2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
