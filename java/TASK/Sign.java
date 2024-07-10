import java.util.Scanner;

public class Sign
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println(num1 + " " + num2 + " " + num3);
        //checks num 1

        if (num1 == 0)
        {
            System.out.println("The first number is 0");
        }
        else if (num1 < 0)
        {
            System.out.println("The first number is Negative");
        }
        else
        {
            System.out.println("The first number is Positive");
        }
        //checks num 2

        if (num2 == 0)
        {
            System.out.println("The Second number is 0");
        }
        else if (num2 < 0)
        {
            System.out.println("The Second number is Negative");
        }
        else
        {
            System.out.println("The Second number is Positive");
        }
        //checks num3


        if (num3 == 0)
        {
            System.out.println("The Third number is 0");
        }
        else if (num3 < 0)
        {
            System.out.println("The Third number is Negative");
        }
        else
        {
            System.out.println("The Third number is Positive");
        }

        System.out.println("\n Enter the number to print its day");

        int day = input.nextInt();


        switch (num2)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                
            default:
                System.out.println("Invalid number for the days of the week");

    }
    //finds the greatest number
        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println("The first Number is the largest");
        }
        else if (num2 >= num1 && num2 >= num3)
        {
            System.out.println("The second number is the largest");
        }
        else
        {
            System.out.println("The third number is the largest");
        }
        System.out.println("System was succesful");
        
}