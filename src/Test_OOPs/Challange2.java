package Test_OOPs;

public class Challange2 {
    public static void main(String[] args) {

        Student S1 = new Student("Navvin", 1234, "A");
        S1.printDetails();
    }
}
class Student {
    String name;
    int rollNo;
    String section;

    Student(String name, int rollNo, String section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    void printDetails(){
        System.out.println("Name:"+name);
        System.out.println("rollNo:"+rollNo);
        System.out.println("Section:"+section);
    }

}

