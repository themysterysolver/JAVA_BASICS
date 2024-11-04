package STAGES;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
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
        stage.setScene(scene);
        stage.show();
    }
}
