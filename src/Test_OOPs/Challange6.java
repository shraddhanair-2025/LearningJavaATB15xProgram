package Test_OOPs;

public class Challange6 {
    public static void main(String[] args) {
//Create a Vehicle base class with start() method.
// Create Car and Bike subclasses that override the start() method.
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}
class Vehicle{
    void start(){
        System.out.println("vehicle make a sound!!");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Starting the car!!");
    }
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Starting the bike!!");
    }
}
