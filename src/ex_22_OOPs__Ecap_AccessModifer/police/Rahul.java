package ex_22_OOPs__Ecap_AccessModifer.police;

public class Rahul extends Cop{

         public Rahul(int bullet){
             super(bullet);

        }

    public static void main(String[] args) {

             Cop Rahul = new Cop(10);
             Rahul.canIShoot();
             Rahul.ThisDefaultF1();
    }

    }
