public class InheritanceExample
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.animal();
        dog.dog();
        System.out.println(dog.legs);

    }
}
