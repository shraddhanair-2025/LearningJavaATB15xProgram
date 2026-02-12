package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab182 {
    public static void main(String[] args) {
       //Car
//        Car tesla = new Car(300);
//        tesla.drive();

    }
}
abstract class Vehicle{
    public int maxSpeed = 180;

    void noTest(){
        System.out.println("Empty!");
    }
    Vehicle(){
        System.out.println("Default Const");
    }
    Vehicle(int a){
        System.out.println("Parameterised const");
    }
    Vehicle(int a,int b){
        System.out.println("Parameterised const");
    }
    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }
    void message(int a){
        System.out.println("PC - arguemnt");
    }
    void drive(){
        System.out.println("Vehicle Parent");
    }

    abstract void driver();

    class Car extends Vehicle{

        private int maxSpeed = 281;

        Car(){
            super(100);
        }
       Car (int a){
           System.out.println("PC Car");
       }
       void test(){

       }
       @Override
       void driver(){
            super.drive();
            this.test();
            super.noTest();
        }
    }


}
