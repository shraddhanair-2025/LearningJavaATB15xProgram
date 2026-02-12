package ex_16_OOPs;

public class Lab161_Cats_OOPs {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        Cat c2 = new Cat("Mufasa");
        Cat c3 = new Cat("Lucy");
        Cat c4 = new Cat("Spicy");
        Cat c5 = new Cat("oggy");

        System.out.println(c3.name);
        System.out.println(c2.name);
    }
}
 class Cat{
     String name;

     Cat(){
         System.out.println("Default Constructor");
         System.out.println(this.name);

     }

     Cat(String nameGiven ){    // Parameterised constructor
         this.name  = nameGiven;
 }
 void running(){
         int local_var = 10; // Local variable
         System.out.println("Who is running ->"+ this.name);

 }


  }
