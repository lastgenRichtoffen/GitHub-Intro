package circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root=new Group();
		
		Scene scene=new Scene(root,900,600);
		
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
