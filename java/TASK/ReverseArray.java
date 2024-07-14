import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter 5 numbers of your choice");

        int[] num = new int[5];
        for (int i = 0; i <= 4; i++)
        {
            num[i] = userinput.nextInt();
        }

        System.out.println("You have Entered: ");

        for (int x = 0; x <= 4; x++)
        {
            System.out.print(num[x]);
        }

        System.out.println();

        System.out.println("Now lets reverse the array");
        
        for (int x = 4; x >= 0; x--)
        {
            int i = 0;
            num[i] = num[x];
            System.out.print(num[i]);
            i++;
        }

        System.out.println("done");


    }
}