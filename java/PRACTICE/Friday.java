

public class Friday
{
    //class attribute
    int coin = 5;
    

    static void sum(int p)
    {
        System.out.println("function/ method works" + " " + p);
        System.out.println("use of recurion");
        int sum = 10;
        System.out.println("initail sum");
        int k;
    }

    static int fact(int k)
    {
        if (k > 0)
        {
            return k + fact(k - 1);
        }
        else
        {
            return 0;
        }
    }
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


       //call a function
       sum(12);


       //recursion

       int result = fact(10);
       System.out.println(result);

       //decrare an object
       Friday myobject = new Friday();
       System.out.println(myobject.coin);


    }
}