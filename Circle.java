public class Circle implements Shape
{
    double radius;
    final double PI = Math.PI;

    public double getArea()
    {
        return PI * Math.pow(radius, 2);
    }

    public double getPerimeter()
    {
        return (2 * PI * radius);
    }
}
