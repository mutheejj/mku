public class PolymophismExample
{
    public static void main(String[] args)
    {
        //creating objects for each class

        Car car = new Car();
        Bycle bycle = new Bycle();
        Truck truck = new Truck();

        /*introducing polymothism to my code 
            vehicle acts as the super class bycle , car and truck are subclases with the same chacteristics as a vehicle*/

        Vehicle[] race = {bycle, car, truck};

        for (Vehicle x : race)
        {
            x.go();
        }

        bycle.go();
        car.go();
        truck.go();
        System.out.println(car.speed);


    }
}