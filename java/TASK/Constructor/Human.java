public class Human{

    // initializing variables 

    String name;
    int age;
    int weight;

    // defining a constuctor 
    Human(String name, int age, int weight){// adding parameters
        this.name = name;// this is used to refer to the current object instance within the class. 
        this.age = age;
        this.weight = weight;

    }
    // added a function

    public void play()
    {
        System.out.println(this.name + " is Playing");
    }
}