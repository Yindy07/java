package controls;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz extends Application{

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border = new BorderPane();
		
		ArrayList<Label> labels = new ArrayList<Label>();
		ArrayList<Label> label = new ArrayList<Label>();
		ArrayList<Label> label2 = new ArrayList<Label>();
		labels.add(new Label("홈"));
		labels.add(new Label("사회"));
		labels.add(new Label("경제"));
		labels.add(new Label("국제"));
		labels.add(new Label("문화"));
		label2.add(new Label("카테고리"));
		label2.add(new Label("노트북/PC"));
		label2.add(new Label("자동차용품"));
		label2.add(new Label("휴대폰"));
		label2.add(new Label("캠핑/낚시"));
		label.add(new Label("ID"));
		label.add(new Label("PW"));
		
		TextField text1 = new TextField();
		PasswordField text2 = new PasswordField();
		TextField text3 = new TextField();
		PasswordField text4 = new PasswordField();
		text1.setMaxSize(140, 30);
		text2.setMaxSize(140, 30);
		text1.setText("test");
		text2.setText("1234");
		text3.setMaxSize(140, 30);
		text4.setMaxSize(140, 30);
		text3.setText("test");
		text4.setText("1234");
		
		Button button = new Button("로그인");
		button.setPrefSize(70, 50);
		
		
		HBox hbox4 = new HBox();
		RadioButton radio1 = new RadioButton("여");
		RadioButton radio2 = new RadioButton("남");
		hbox4.getChildren().addAll(radio1, radio2);
		hbox4.setSpacing(15);
		ToggleGroup group = new ToggleGroup();
		radio1.setToggleGroup(group);
		radio2.setToggleGroup(group);
		
		HBox hbox5 = new HBox();
		CheckBox check1 = new CheckBox("게임");
		CheckBox check2 = new CheckBox("공부");
		hbox5.getChildren().addAll(check1, check2);
		hbox5.setSpacing(15);
		HBox hbox6 = new HBox();
		Label la = new Label("하고 싶은 말");
		hbox6.getChildren().add(la);
		HBox hbox7 = new HBox();
		TextArea area = new TextArea();
		area.setMaxSize(200, 80);
		hbox7.getChildren().add(area);
		
		
		FlowPane flowtop = new FlowPane();
		flowtop.setAlignment(Pos.CENTER);
		flowtop.getChildren().addAll(labels);
		flowtop.setPadding(new Insets(25));
		flowtop.setHgap(40);
		border.setTop(flowtop);
		
		VBox vbox = new VBox(10);
		FlowPane flowleft = new FlowPane();
		vbox.getChildren().addAll(label2);
		vbox.setSpacing(25);
		flowleft.getChildren().addAll(vbox);
		flowleft.setPadding(new Insets(15));
		flowleft.setPrefSize(100, 450);
		border.setLeft(flowleft);
		
		GridPane grid = new GridPane();
		grid.add(text3, 0, 0);
		grid.add(text4, 0, 1);
		grid.add(button, 1, 0, 1, 2);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(26, 15, 0, 0));
		
		VBox vbox2 = new VBox();
		VBox vbox3 = new VBox();
		HBox hbox2 = new HBox();
		HBox hbox3 = new HBox();
		HBox hbox8 = new HBox();
		
		vbox3.getChildren().addAll(hbox4, hbox5, hbox6, hbox7);
		vbox3.setSpacing(20);
		
		vbox2.setPadding(new Insets(26));
		hbox2.getChildren().addAll(label.get(0), text1);
		hbox3.getChildren().addAll(label.get(1), text2);
		vbox2.getChildren().addAll(hbox2, hbox3, vbox3);
		hbox2.setSpacing(15);
		hbox3.setSpacing(10);
		vbox2.setSpacing(15);
		hbox8.getChildren().addAll(vbox2, grid);
		border.setCenter(hbox8);
		
		
		Scene scene = new Scene(border, 560, 400);
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
/*
		BorderPane border =  new BorderPane();
		
		ArrayList<Label> topLabel = new ArrayList<Label>();
		topLabel.add(new Label("홈"));
		topLabel.add(new Label("사회"));
		topLabel.add(new Label("경제"));
		topLabel.add(new Label("국제"));
		topLabel.add(new Label("문화"));
		
		HBox top = new HBox();
		top.setAlignment(Pos.CENTER);
		top.setSpacing(30);
		top.setPadding(new Insets(20));

		top.getChildren().addAll(topLabel);
		border.setTop(top);
		
		ArrayList<Label> leftLabel = new ArrayList<Label>();
		leftLabel.add(new Label("카테고리"));
		leftLabel.add(new Label("노트북/PC"));
		leftLabel.add(new Label("자동차용품"));
		leftLabel.add(new Label("휴대폰"));
		leftLabel.add(new Label("캠핑/낚시"));
		
		VBox left = new VBox();
		left.setSpacing(20);
		left.setPadding(new Insets(10));
		left.setPrefWidth(100);
		
		left.getChildren().addAll(leftLabel);
		border.setLeft(left);
		
		
		VBox center = new VBox();
		
		HBox idBox = new HBox();
		Label idLabel = new Label("ID");
		idLabel.setPadding(new Insets(5, 5, 0, 0));
		
		idBox.getChildren().add(idLabel);
		idBox.getChildren().add(new TextField());
		idBox.setSpacing(15);
		center.getChildren().add(idBox);
		
		HBox pwBox = new HBox();
		Label pwLabel = new Label("PW");
		pwLabel.setPadding(new Insets(5, 0, 0, 0));
		
		pwBox.getChildren().add(pwLabel);
		pwBox.getChildren().add(new PasswordField());
		pwBox.setSpacing(15);
		center.getChildren().add(pwBox);

		HBox radioBox = new HBox();
		RadioButton woman = new RadioButton("여");
		RadioButton man = new RadioButton("남");
		ToggleGroup genderGroup = new ToggleGroup();
		woman.setToggleGroup(genderGroup);
		man.setToggleGroup(genderGroup);
		radioBox.getChildren().addAll(woman, man);
		radioBox.setSpacing(15);
		center.getChildren().add(radioBox);
		
		HBox checkBox = new HBox();
		CheckBox game = new CheckBox("게임");
		CheckBox study = new CheckBox("공부");
		checkBox.getChildren().addAll(game, study);
		checkBox.setSpacing(15);
		center.getChildren().add(checkBox);
		
		HBox sayBox = new HBox();
		sayBox.getChildren().add(new Label("하고 싶은 말"));
		center.getChildren().add(sayBox);
		
		HBox areaBox = new HBox();
		TextArea area = new TextArea();
		area.setPrefSize(170, 50);
		areaBox.getChildren().add(area);
		center.getChildren().add(areaBox);
		
		center.setSpacing(15);
		center.setPadding(new Insets(10));
		center.setMaxWidth(190);
		border.setCenter(center);
		
	
		TextField idFld = new TextField();
		PasswordField pwFld = new PasswordField();
		
		VBox idPw = new VBox();
		idPw.getChildren().addAll(idFld, pwFld);
		idPw.setSpacing(5);
		
		VBox login = new VBox();
		Button loginButton = new Button("로그인");
		loginButton.setPrefSize(70, 50);
		login.getChildren().add(loginButton);
		
		HBox right = new HBox();
		right.getChildren().addAll(idPw, login);
		right.setSpacing(5);
		right.setPadding(new Insets(10));
		border.setRight(right);
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(border, 550, 300));
		primaryStage.show();
	}
}
*/


