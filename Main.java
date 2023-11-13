import java.util.ArrayList;

public class Main 
{

    public static void main(String[] args) 
    {
        B b = new B();
        StudentLogic();
    }

    public static void StudentLogic()
    {
        Student student1 = new Student("Jake", "Estrich");        
        Student student2 = new Student("Tom", "Dom");
        Student student3 = new Student("Chad", "Giga");
        Student student4 = new Student("Kyle", "Mountain");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for(Student student : students)
        {
            student.PrintNames();
        }
    }


}