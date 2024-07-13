// import a class scanner to accept user imput
import java.util.Scanner;
public class ArrayExample
{
   public static void main(String[] args)
   {
    // add a n  object to access the class ; i have named it new
    Scanner enter = new Scanner(System.in);
    //array
     int[] num = {1, 2, 3, 4, 5, 6};

     System.out.println(num[2]);
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]);


    System.out.println("the program will now calculate the sum: ");
    // define lenght of the  array
    int number[] = new int[5];
    int sum = 0;
    //user input
    for (int i = 0; i <= 4; i++)
    {
        number[i] = enter.nextInt();
        sum += number[i];
    }

    System.out.println("The sum is : " + sum);

    // average
    int average = sum / 5;

    System.out.println("The average is : " + average);
   }

}