package sample;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class TestShape
{
    public Group makeShape()
    {
        Group root = new Group();
        double offset = 80;
        double height = 100;
        double width = 150;
        Line line1 = new Line(offset,offset,width+offset,offset);
        Line line2 = new Line(width+offset,offset,width+offset,height+offset);
        Line line3 = new Line(offset,height+offset,width+offset,height+offset);
        Line line4 = new Line(offset,offset,offset,height+offset);
        Circle circle = new Circle(width/2+offset,height/2+offset,height/4);
        root.getChildren().addAll(line1,line2,line3,line4,circle);

        return root;
    }
}
