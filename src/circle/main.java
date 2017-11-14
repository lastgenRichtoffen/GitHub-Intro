package circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root=new Group();
		
		Scene scene=new Scene(root,900,600);
		
		Circle cir = new Circle(45);
		cir.setTranslateX(450);
		cir.setTranslateY(300);
		
		root.getChildren().add(cir);
		
		scene.setOnKeyPressed(event ->{
			if(event.getCode()==KeyCode.D){
			cir.setTranslateX(cir.getTranslateX()+5);
			}
			if(event.getCode()==KeyCode.A){
				cir.setTranslateX(cir.getTranslateX()-5);
			}						
			if(event.getCode()==KeyCode.W){
				cir.setTranslateY(cir.getTranslateY()-5);
			}	
			if(event.getCode()==KeyCode.S){
				cir.setTranslateY(cir.getTranslateY()+5);
			}	
		});

		
		
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
