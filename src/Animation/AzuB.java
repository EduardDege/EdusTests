package Animation;

import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AzuB extends Application {
	int A = 1;
	int B = 2;
	int x1 = 200;
	int x2 = 500;
	int y1 = 200;
	int x=0, y=0, z=0;
	BorderPane pane= new BorderPane();
	HBox box = new HBox();
	ChoiceBox <Integer> a = new ChoiceBox<>();
	ChoiceBox <Integer> b = new ChoiceBox<>();
	Button btn = new Button ("Play");
	Rectangle rt1 = new Rectangle(x1, 200, 50, 50);
    Rectangle rt2 = new Rectangle(x1, y1+100, 50, 50); 
    Rectangle rt3 = new Rectangle(x2, y1+100, 50, 50); 
    
    public void Einstellungen(){
		box.setPadding(new Insets(40, 10, 40 ,10));
        box.setStyle("-fx-background-color: #100000");
        box.setSpacing(20); 
        pane.setStyle("-fx-background-color: #448899");
        pane.setPrefSize(800, 800);
        pane.setTop(box);
        rt1.setFill(Color.RED);
		rt2.setFill(Color.GREEN);
		a.getItems().addAll(A, B);
		a.setValue(A);
		b.getItems().addAll(A, B);
		b.setValue(B);
		btn.setOnAction(e -> play(a, b));
    	
    }
	public void play(ChoiceBox <Integer> a,ChoiceBox <Integer> b ){
		
		if(a.getValue()==A && b.getValue()==B){
		
		}
		
	}
	public void start(Stage stage) {
        Einstellungen();
        box.getChildren().addAll(a,b, btn);
		pane.getChildren().addAll(rt1, rt2, rt3);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
		
		
		
	}
 
	public static void main(String[] args) {
		launch(args);
	}
}
/* Ideen :
 * StackPane? nach dem obersten Objeckt im "stack suchen"
 * Bounds? analysiert die position der Objeckts un dann damit was anfangen*/
 */