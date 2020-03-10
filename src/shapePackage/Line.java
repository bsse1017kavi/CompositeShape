package shapePackage;

import javafx.scene.Group;

public class Line implements IShape
{
    double startX;
    double startY;
    double endX;
    double endY;
    double offset;
    double length;

    public Line(double startX, double startY, double endX, double endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public Line(double offset, double length) {
        this.offset = offset;
        this.length = length;
        this.startX = offset;
        this.startY = offset;
        this.endX = offset+length;
        this.endY = offset;
    }

    @Override
    public Group draw()
    {
        javafx.scene.shape.Line line = new javafx.scene.shape.Line(startX,startY,endX,endY);

        Group root = new Group();

        root.getChildren().add(line);

        return root;
    }
}
