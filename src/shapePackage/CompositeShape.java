package shapePackage;

import javafx.scene.Group;
import javafx.scene.Node;

import java.util.ArrayList;

public abstract class CompositeShape implements IShape
{
    ArrayList<IShape> shapes = new ArrayList<>();
    ArrayList<Node> nodes = new ArrayList<>();

    @Override
    public Group draw()
    {
        buildShape();

        for(IShape shape: shapes)
        {
            nodes.add(shape.draw());
        }

        Group root = new Group();

        for(Node node:nodes)
        {
            root.getChildren().add(node);
        }

        return root;
    }

    public abstract void buildShape();
}
