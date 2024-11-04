package STAGES;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class stage extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Stage s=new Stage(); //Creating a new stage!!
        Group root=new Group();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
