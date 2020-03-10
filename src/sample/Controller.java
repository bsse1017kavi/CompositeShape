package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import shapePackage.Circle;
import shapePackage.Flag;
import shapePackage.Line;
import shapePackage.Rectangle;

public class Controller
{
    @FXML
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    public void drawLine(ActionEvent e)
    {

        double offset = 80;
        double length = 100;

        shapePackage.Line line = new Line(offset,length);


        Group root = line.draw();

        Scene scene = new Scene(root,300,300);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void drawCircle(ActionEvent e)
    {
        double offset = 150;
        double radius = 100;

        Circle circle = new Circle(offset,offset,radius);

        Group root = circle.draw();

        Scene scene = new Scene(root,300,300);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void drawRectangle(ActionEvent e)
    {
        double offset = 80;
        double height = 100;
        double width = 150;

        Rectangle rectangle = new Rectangle(offset,width,height);

        Group root = rectangle.draw();

        Scene scene = new Scene(root,300,300);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void drawFlag(ActionEvent e)
    {
        double offset = 80;
        double height = 100;
        double width = 150;

        Flag flag = new Flag(offset,width,height);

        Group root = flag.draw();

        Scene scene = new Scene(root,300,300);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
