public class Rectangle implements Shape
{
    double height;
    double base;
    double length;
    double width;

    public double getArea() 
    {
        return (base * height);
    }

    public double getPerimeter()
    {
        return 2*(length+width);
    }
}
