package ex_16_OOPs;

public class Lab164_Car {
    public static void main(String[] args) {


        Car t = new Car();
        System.out.println(t.name);
        Car p = new Car("XUV");
        System.out.println(p.name);
        Car p1 = new Car("tesla","2016");
        System.out.println(p1.name);
    }
}
        class Car {
            String name;
            int year;
            String model;
            Car() {
                name = "Unknown Car";
                year = 1991;
                model = "XxX";
            }
            Car(String nameGiven){
            this.name = nameGiven;
            }
            Car(String nameGiven, String modelGiven){
            this.name = nameGiven;
            this.model = modelGiven;
            }
        }