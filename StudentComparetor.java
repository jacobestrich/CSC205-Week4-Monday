import java.util.Comparator;

public class StudentComparetor implements Comparator<Student>
{

    public int compare(Student student1, Student student2) 
    {
        return student1.FirstName.compareTo(student2.FirstName);
    }
    
}
