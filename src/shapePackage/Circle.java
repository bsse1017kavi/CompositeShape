package shapePackage;

import javafx.scene.Group;

public class Circle implements IShape
{
    double centreX;
    double centreY;
    double radius;

    public Circle(double centreX, double centreY, double radius) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
    }

    @Override
    public Group draw() {
        javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle(centreX,centreY,radius);

        Group root = new Group();

        root.getChildren().add(circle);

        return root;
    }
}
