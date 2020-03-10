package shapePackage;

public class Rectangle extends CompositeShape
{
    double offset;
    double width;
    double height;

    public Rectangle(double offset, double width, double height) {
        this.offset = offset;
        this.width = width;
        this.height = height;
    }

    @Override
    public void buildShape()
    {
        Line line1 = new Line(offset,offset,width+offset,offset);
        Line line2 = new Line(width+offset,offset,width+offset,height+offset);
        Line line3 = new Line(offset,height+offset,width+offset,height+offset);
        Line line4 = new Line(offset,offset,offset,height+offset);

        this.shapes.add(line1);
        this.shapes.add(line2);
        this.shapes.add(line3);
        this.shapes.add(line4);
    }
}
