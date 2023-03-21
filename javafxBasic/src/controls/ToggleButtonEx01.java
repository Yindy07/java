package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ToggleButtonEx01 extends Application{

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		ToggleButton tb1 = new ToggleButton();
		ToggleButton tb2 = new ToggleButton();
		
		ToggleGroup group = new ToggleGroup(); //같은 그룹에 넣어 하나만 클릭되도록
		tb1.setToggleGroup(group);
		tb2.setToggleGroup(group);
		
		
		tb1.setText("눌림 버튼1");
		tb2.setText("눌림 버튼2");
		//tb2.setSelected(true); // 해당하는 토글버튼의 체크가 눌러있는 상태로 출력
		
//		System.out.println("toggle1 : " + tb1.isSelected()); //현재 토글버튼이 눌러있는지 유무에 따라 t or f 반환
//		System.out.println("toggle2 : " + tb2.isSelected());
		
		HBox box = new HBox(10); //Hbox(?) = 구성요소 간격
		box.getChildren().addAll(tb1, tb2); // hbox넣어 출력
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		primaryStage.setTitle("ToggleButtonEx1");
		primaryStage.setScene(new Scene(box, 200, 100));
		primaryStage.show();
	}
}
