package SCENES_DRAWING;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
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

        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();
    }
}
