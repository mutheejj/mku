import java.lang.Math;

public class Square {
    public static void main(String[] args){
        hello();
        int sum = hello();
        System.out.println("The perimeter is: " + sum +"cm");
    }
    static int hello()
    {
        int x = 12;

        System.out.println("The the side of the square is : " + x + "cm");
        int area = x * x;
        double squareroot = Math.sqrt(area);
        System.out.println("the area is:" + area);
        System.out.println("the squreroot is:" + squareroot);
        return x + x;

    }
}


