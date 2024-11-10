import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class controller {

    @FXML
    private Circle mycircle;
    private double x, y;


    public void up(ActionEvent e){
        System.out.println("Up");
        mycircle.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
        System.out.println("down");
        mycircle.setCenterY(y+=10);
    }public void left(ActionEvent e){
        System.out.println("left");
        mycircle.setCenterX(x-=10);
    }public void right(ActionEvent e){
        System.out.println("right");
        mycircle.setCenterX(x+=10);
    }



}
