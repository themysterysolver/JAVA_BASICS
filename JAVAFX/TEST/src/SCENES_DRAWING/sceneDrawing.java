package SCENES_DRAWING;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class sceneDrawing extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) throws Exception {
        Stage stage=new Stage();
        Group root=new Group();
        Scene scene=new Scene(root,420,420, Color.GREENYELLOW);

        Text text=new Text();
        text.setText("Hello world!");
        text.setX(50);
        text.setY(50);
        text.setFill(Color.DARKGREEN);
        text.setFont(Font.font("Verdana"));

        Line line=new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(200);
        line.setEndY(200);
        line.setStrokeWidth(10);
        line.setStroke(Color.RED);
        line.setOpacity(1);
        line.setRotate(45);

        root.getChildren().add(text);
        root.getChildren().add(line);
        stage.setScene(scene);
        stage.show();
    }
}
