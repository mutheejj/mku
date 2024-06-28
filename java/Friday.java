

public class Friday
{
    public static void main(String[] args)
    {
        //how to print output
        System.out.println("hello");
        //how to use Math
        int x = Math.max(5, 10);
        System.out.println(x);
        int random = (int) (Math.random()*101);
        System.out.println(random);
        int z = random + x;

        //use of if statment
        if (z < 50)
        {
            System.out.println("greater than 50");
        }
        else
        {
            System.out.println("less than 50");
        }

        System.out.println("short hand if at work");
        //how to use short hand if
        String y = (z < 50) ? ("less") : ("greater");
        System.out.println(y);
    }
}