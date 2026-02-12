package ex_19_OOPs_Part2.OOPs_01_inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {

        Son pramod = new Son();
        pramod.home();
        pramod.gf();
        pramod.extraMoney();
        pramod.bhk3();

        Father f = new Father();
        f.gf();
        f.home();
        f.extraMoney();

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        // Dynamic Dispatch
        GrandFather g1 = new Son();
        Father f1 = new Son();

        //Son s1 = new GrandFather(); //not possble
        //Son s2 = new Father();


    }
}
