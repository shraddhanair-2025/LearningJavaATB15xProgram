package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_SB {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append("Programming");
        System.out.println(stringBuffer);

        stringBuffer.replace(0,4,"C++");
        System.out.println(stringBuffer);
    }
}
