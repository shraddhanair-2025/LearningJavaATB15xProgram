package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab185_Abstract {

    public static void main(String[] args){
      //  Son s1 = new Son();

      abstract class Father{
         abstract void loan50k();
 //     concreat - compleat method
          void loan10k(){
              System.out.println("Given!");
          }
}
      class Son extends Father{
          void loan50k(){
              System.out.println("Given");
          }
      }
    }
}
