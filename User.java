public class User 
{
    private String FirstName;
    String LastName;

    public User(String FirstName, String LastName) 
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public User(String FirstName) 
    {
        this.FirstName = FirstName;
    }

    public void PrintNames()
    {
        System.out.println("User Names: " + FirstName + " " + LastName);
    }
}
