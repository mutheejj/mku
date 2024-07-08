class Station
{
    String all = "ihaveseveralimayhouse";
    public void printall()
    {
        System.out.println(all);
    }



}

class plastic extends Station
{
    String sev = "plasticareofdiffrentcollors";

    public void printsev()
    {
        System.out.println(sev);
    }
   
    public static void main(String[] args)
    {
        plastic x = new plastic();

        x.printall();
        x.printsev();
    }

}