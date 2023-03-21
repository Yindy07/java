package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioBoxEx extends Application{

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		RadioButton radio1 = new RadioButton("라디오1");
		RadioButton radio2 = new RadioButton("라디오2");
		
		ToggleGroup group = new ToggleGroup(); //같은 그룹에 넣어 하나만 클릭되도록
		radio1.setToggleGroup(group);
		radio2.setToggleGroup(group);
		
		
		radio1.setText("멍때리기");
		radio2.setText("침대와 혼연일체");
		radio2.setSelected(true); // 해당하는 라디오버튼의 체크가 눌러있는 상태로 출력
		
		System.out.println("radio1 : " + radio1.isSelected()); //현재 라디오버튼이 눌러있는지 유무에 따라 t or f 반환
		System.out.println("radio2 : " + radio2.isSelected());
		
		HBox box = new HBox(10); //Hbox(?) = 구성요소 간격
		box.getChildren().addAll(radio1, radio2); // hbox넣어 출력
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("RadioButtonEx");
		primaryStage.setScene(new Scene(box, 200, 100));
		primaryStage.show();
	}
}
