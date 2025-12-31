package ex_02_Variables_DataTypes;

public class Lab024_printF {
    public static void main(String[] args) {
      //  System.out.println("It will print a new line");
        // System.out.print("It will not print a new line");

        byte a = 10;
        //System.out.println("Value of a is->"+a);
        //System.out.print("Value os a is ->"+a);
        System.out.printf("Value of a is %d",a);
        //%d -> int,byte,long.short - data type
        //%s-> string
//%f-> float, double
//%b ->Boolean

        int aa = 100;
        int bb = 121;
        System.out.printf("When you multiply aabb result is = %d*%d",aa,bb);

        int table = 9;
        System.out.printf("%d*1 = %d", table,table*1 );
        System.out.printf(",%d*2 = %d", table,table*2 );
        System.out.printf(",%d*3 = %d", table,table*3 );
        System.out.printf(",%d*4 = %d", table,table*4 );
        System.out.printf(",%d*5 = %d", table,table*5 );
        System.out.printf(",%d*6 = %d", table,table*6 );
        System.out.printf(",%d*7 = %d", table,table*7 );
        System.out.printf(",%d*8 = %d", table,table*8 );
        System.out.printf(",%d*9 = %d", table,table*9 );
        System.out.printf(",%d*10 = %d", table,table*10 );
    }
            }
