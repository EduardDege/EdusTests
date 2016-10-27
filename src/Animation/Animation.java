package Animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation  extends Application {
    
	Rectangle a = new Rectangle(300,300, 50, 50);
    ChoiceBox <Integer> cBox = new ChoiceBox<Integer>();
    Button btn = new Button("Play");
    PathTransition transition = new PathTransition();
	
	@Override
	public void start(Stage stage) {
		Pane pane = new Pane();
		a.setFill(Color.RED);
		cBox.getItems().addAll(1,2);
		cBox.setValue(1);
		btn.setLayoutX(350);
		btn.setLayoutY(50);
		btn.setOnAction(e -> getChoice(cBox));
//		Circle c = new Circle(100);
//		c.setLayoutX(300);
//		c.setLayoutY(200);
//		
//		transition.setNode(a);
//		transition.setDuration(Duration.seconds(2));
//		transition.setPath(c);
//		transition.setCycleCount(PathTransition.INDEFINITE);
//		transition.play();
//		KeyValue xVal = new KeyValue(a.xProperty(),1);
//		KeyValue yVal = new KeyValue(a.yProperty(),1);
//		KeyFrame keyFrame= new KeyFrame(Duration.seconds(1), xVal,yVal);
//		Timeline timeline = new Timeline();
//		timeline.setCycleCount(Timeline.INDEFINITE);
//		timeline.setAutoReverse(true);
//		timeline.getKeyFrames().addAll(keyFrame );
//		timeline.play();
		pane.getChildren().addAll(a, cBox, btn);
		pane.setPrefSize(600, 400);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("Animation");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	private void getChoice(ChoiceBox <Integer> cBox){
		if(cBox.getValue()==1){
		
		KeyValue xVal = new KeyValue(a.xProperty(),1);
		KeyValue yVal = new KeyValue(a.yProperty(),1);
		KeyFrame keyFrame= new KeyFrame(Duration.seconds(1), xVal,yVal);
		Timeline timeline = new Timeline();
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.setAutoReverse(true);
		timeline.getKeyFrames().addAll(keyFrame );
		timeline.play();
		}else{
			Circle c = new Circle(100);
			c.setLayoutX(300);
			c.setLayoutY(200);
			
			transition.setNode(a);
			transition.setDuration(Duration.seconds(2));
			transition.setPath(c);
			transition.setCycleCount(PathTransition.INDEFINITE);
			transition.play();
			
		}
	}
}
