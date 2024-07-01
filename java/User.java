import java.util.Scanner;

public class User
{
    public static void main(String[] args)
    {
        System.out.println("hello");

        Scanner myobject = new Scanner(System.in);
        System.out.println("Enter the user name");
        String username = myobject.nextLine();

        System.out.println("welcome " + username);
    }
}