

/**
 * Created by pavlo.balyuk on 8/29/2017.
 */
public class Constructors {
    public static void main (String[] args) {
        String s = ", ";
        Student student = new Student("Vasya", "Pupkin");
        System.out.println(student.getName());
        Student student1 = new Student("Petya", "Pupkin", 17);
        System.out.println(student1.getAge());
        student1.setAge(25);
        System.out.println(student1.getAge());

        Computer comp = new Computer(20);
        comp.getRam();
        System.out.println(comp.getRam());
        Computer comp1 = new Computer("AMD", 2.0);
        System.out.println(comp1.getProcType() + s + comp1.getRam() + s + comp1.getHdd());
        Computer comp2 = new Computer("Intel", 1024, 2.0);
        System.out.println(comp2.getProcType() + s + comp2.getRam() + s + comp2.getHdd());

        Car car = new Car();
        car.setGas();
        car.setWheels(2);
        car.setMotor(false);
        System.out.println(car.getGas() + s + car.getWheels() + s + car.getMotor());
        Car car1 = new Car(2);
        System.out.println(car1.getGas() + s + car1.getWheels() + s + car1.getMotor());
        Car car2 = new Car(2, false);
        System.out.println(car2.getGas() + s + car2.getWheels() + s + car2.getMotor());
    }
}
