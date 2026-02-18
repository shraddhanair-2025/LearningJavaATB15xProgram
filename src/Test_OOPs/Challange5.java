package Test_OOPs;

public class Challange5 {
    public static void main(String[] args) {
        //   Create a class "Animal" and subclasses "Dog" and "Cat".
        //   Override a method to make each animal make a sound.
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makesound();
        a2.makesound();
    }
}
// Superclass
class Animal{
void makesound(){
    System.out.println("Animal make sound");
}
}
//Subclass
class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("Dog says:Bhau Bhau");
    }
}
//Subclass
class Cat extends Animal {
    @Override
    void makesound(){
        System.out.println("Cat says:Meyaoo Meyaoo");
    }
}
