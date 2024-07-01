public class July
{
    int y = 12;

    public int fano(int x)
    {
        x = 12;
        int sum = 0;
        if (x >= 0)
        {
            return (sum + fano(x - 1));
        }
        return -1;
    }

    public static void main(String[] args)
    {
        July myobject = new July();
        System.out.println("It is a new month");
        System.out.println(myobject.y);

        //how to call the object??

        int num = 22;
        String an = (num >= 22) ? "hello" : "hey";
        System.out.println(an);
    }
}