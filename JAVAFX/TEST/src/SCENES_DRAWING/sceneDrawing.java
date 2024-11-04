package SCENES_DRAWING;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
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

        Polygon triangle=new Polygon();
        triangle.getPoints().setAll(200.00,300.0,200.00,200.00,300.00,300.00);
        triangle.setFill(Color.ORANGE);

        Circle circle=new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.VIOLET);

        Image image=new Image("hello.png");
        ImageView imageview=new ImageView(image);
        imageview.setX(300);
        imageview.setY(10);
        imageview.setFitWidth(50);
        imageview.setFitHeight(50);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageview);
        stage.setScene(scene);
        stage.show();
    }
}
