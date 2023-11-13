public class Triangle implements Shape
{
    double height;
    double base;
    double a;
    double b;
    double c;

    public Triangle(double base, double height) 
    {
        super();
        this.height = height;
        this.base = base;
    }



    public double getArea() 
    {
        return (base * height) / 2;
    }


    public double getPerimeter()
    {
        return (a + b + c);
    }
}
