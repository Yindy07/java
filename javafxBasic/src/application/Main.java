package application;
	

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label label = new Label();
			label.setText("출력할 내용");
			Font font = new Font(20);
			label.setFont(font);
			Scene scene = new Scene(label, 400, 400);
			
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension screenSize = tk.getScreenSize(); 	//사용ㅇ중인 모니터 해상도
			System.out.println("width : " + screenSize.width);
			System.out.println("height : " + screenSize.height);
			
			int x = screenSize.width;
			int y = screenSize.height;
			
			primaryStage.setTitle("아무거나");
			primaryStage.setX(x/2 - 200); //정가운데 : (해상도 구한값)/2 - (scene크기 값)
			primaryStage.setY(y/2 - 200);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
