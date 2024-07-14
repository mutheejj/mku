import java.util.Scanner;

public class Rectangle
{
    int lenght;
    int width;

    public int area()
    {
        return lenght * width;
    }

    public int perimeter()
    {
        return (2 * lenght) + (2 * width);
    }

    public Rectangle(int y, int x)
    {
        this.lenght = x;
        this.width = y;
    }

    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the length and the width of the rectangle:");
        int length = user.nextInt();
        int width = user.nextInt();
        Rectangle myObject = new Rectangle(length, width);

        int arearesult = myObject.area();
        int perimeterresult = myObject.perimeter();

        System.out.println("The area is: " + arearesult + "and the perimeter is : " + perimeterresult);

    }
}