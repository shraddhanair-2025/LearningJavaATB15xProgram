package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
    public static void main(String[] args) {

        ICICIBank amit = new ICICIBank();
        long bal = amit.getBal();
        System.out.println(bal);
       // System.out.println(amit.bal());
        amit.setBal(200,false);
        System.out.println(amit.getBal());

        //Cachier
        ICICIBank cachier = new ICICIBank();
        cachier.setBal(200,true);
        System.out.println(cachier.getBal());

    }
}
class ICICIBank{
    private String name;
    private long bal;

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, Boolean isCashir) {
        if(isCashir){
        this.bal = bal;
    }
        else {
            System.out.println("Not allow to modify bal");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}