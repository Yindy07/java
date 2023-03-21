package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CheckBoxEx extends Application{

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		CheckBox check1 = new CheckBox("체크1");
		CheckBox check2 = new CheckBox("체크2");
		ToggleGroup group = new ToggleGroup(); 
		
		check1.setText("멍때리기");
		check2.setText("침대와 혼연일체");
		
		check2.setSelected(true); // 해당하는 체크박스의 체크가 눌러있는 상태로 출력
		
		System.out.println("check1 : " + check1.isSelected()); //현재 체크박스가 눌러있는지 유무에 따라 t or f 반환
		System.out.println("check2 : " + check2.isSelected());
		
		HBox box = new HBox(10); //Hbox(?) = 구성요소 간격
		box.getChildren().addAll(check1, check2);
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("CheckBoxEx");
		primaryStage.setScene(new Scene(box, 200, 100));
		primaryStage.show();
	}
}
