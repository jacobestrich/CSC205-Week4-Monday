import java.util.ArrayList;

public class Main 
{

    public static void main(String[] args) 
    {
        //B b = new B();
        StudentLogic();

        // Triangle triangle = new Triangle(100, 3);
        // double area = triangle.getArea();
        // System.out.println("Triangle Area: " + area);

        // Circle circle = new Circle();
        // Rectangle rectangle = new Rectangle();

        // isShape(rectangle);
        // isShape(circle);
        // isShape(triangle);
        // isShape(null);

    }


    public static void isShape(Shape shape)
    {
        if(shape instanceof Shape)
        {
            System.out.println("This is a shape.");
        }
        else
        {
            System.out.println("This is not a shape.");
        }
    }



    public static void StudentLogic()
    {
        System.out.println("Before Sort:");
        Student student1 = new Student("Jake", "Estrich");        
        Student student2 = new Student("Tom", "Dom");
        Student student3 = new Student("Chad", "Giga");
        Student student4 = new Student("Anthony", "Maroun");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for(Student student : students)
        {
            student.PrintNames();
        }
        students.sort(new StudentComparetor());
        System.out.println("After sort completed");

    }


}