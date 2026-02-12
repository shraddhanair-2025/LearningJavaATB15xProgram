package Test_OOPs;

public class Challange1 {
    public static void main(String[] args) {

        Person P1 = new Person("rahul",25);
        P1.Display();
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        void Display(){
            System.out.println("Name:" + name);
            System.out.println("age:" + age);
        }


    }
}
