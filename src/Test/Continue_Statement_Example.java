package Test;

public class Continue_Statement_Example {
    public static void main(String[] args) {

        for (int i=1; i<=10;i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
