//https://www.youtube.com/watch?v=As7TEjqJ3Ao&list=PLZPZq0r_RZOM-8vJA3NQFZB7JroDcMwev&index=3
package STAGES;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class stage extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        //Stage s=new Stage(); //Creating a new stage!!
        Group root=new Group();
        Scene scene=new Scene(root, Color.BLACK);
        stage.setTitle("My first STAGE!!");
        Image icon=new Image("hello.png");
        stage.getIcons().add(icon);

        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);

        //stage.setX(0);
        //stage.setY(0);

        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Click Q to escape!");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Q"));
        stage.setScene(scene);
        stage.show();
    }
}
