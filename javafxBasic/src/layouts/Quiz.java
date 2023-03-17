package layouts;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button[] buttons = new Button[6];
		String[] strings = {"메뉴 나열", "내용 들어가는 곳","아이디 입력","비밀번호 입력","로그인", "바닥글 들어가는 곳"};
		
		for(int i=0; i<strings.length; i++) {
			buttons[i] = new Button(strings[i]); 
		}
		Label labelmenu = new Label("메뉴");
		Label labelhome = new Label("홈");
		Label labellogin = new Label("로그인");
		
		FlowPane flowleft = new FlowPane();
		FlowPane flowcenter = new FlowPane();
		FlowPane flowright = new FlowPane();
		FlowPane flowbottom = new FlowPane();
		
		FlowPane flowlabel = new FlowPane();
		flowlabel.getChildren().addAll(labelmenu, labelhome, labellogin);
		flowlabel.setAlignment(Pos.CENTER);
		flowlabel.setHgap(100);
		flowlabel.setPrefSize(250, 50);
		flowlabel.setStyle("-fx-background-color: #FFD6FD");
		BorderPane border = new BorderPane();
		border.setTop(flowlabel);
		
		flowleft.getChildren().add(buttons[0]);
		flowleft.setPrefSize(100, 250);
		flowleft.setStyle("-fx-background-color: #7EFFFF");
		
		flowcenter.getChildren().add(buttons[1]);
		flowcenter.setPrefSize(120, 250);
		flowcenter.setStyle("-fx-background-color: #89FF82");
		
		GridPane grid = new GridPane();
		GridPane.setConstraints(buttons[2], 0, 0);
		GridPane.setConstraints(buttons[3], 0, 1);
		GridPane.setConstraints(buttons[4], 1, 0, 1, 2);
		
		buttons[2].setPrefSize(120, 25);
		buttons[3].setPrefSize(120, 25);
		buttons[4].setPrefSize(100, 50);
		grid.setPadding(new Insets(15, 80, 0, 0));
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setPrefSize(350, 250);
		grid.setStyle("-fx-background-color: #FAF4C0");
		grid.getChildren().addAll(buttons[2], buttons[3],buttons[4]);
		
		flowbottom.getChildren().add(buttons[5]);
		flowbottom.setPrefSize(250, 50);
		flowbottom.setStyle("-fx-background-color: #FFC19E");
		flowbottom.setAlignment(Pos.CENTER);
		
		
		
		border.setLeft(flowleft);
		border.setCenter(flowcenter);
		border.setRight(grid);
		border.setBottom(flowbottom);
		
		Scene scene = new Scene(border, 700,300);
		
		primaryStage.setTitle("Quiz1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
