package Tasks5;

import Interfaces.*;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/6/2017.  From task 5.1 Automation testing course
 */
public class StudentImproved implements IChillable{

    String name;
    String surname;
    /**Task 5.5.a and 5.5.b Automation testing course here*/
    StudentImproved() {
    }

    StudentImproved(String nameInput) {
        this.name = nameInput;
    }

    StudentImproved(String nameInput,String surnameInput) {
        name = nameInput;
        surname = surnameInput;
    }

    StudentImproved(StudentImproved oldstudent) {
        this.name = oldstudent.name;
        this.surname = oldstudent.surname;
    }
    /**Task 5.5.a and 5.5.b Automation testing course here*/
    /**Task 5.6.a Automation testing course here*/
    public String toString() {
        return this.getName() + this.getSurname() + "@" + Integer.toHexString(hashCode());
    }
    /**Task 5.6.a Automation testing course here*/

    /**Task 5.4.b Automation testing course here*/
    Boolean equals(StudentImproved student) {
        return this.name == student.name && this.surname == student.surname;
    }
    /**Task 5.4.b Automation testing course here*/

    void enrollCourse() {
        out.println("Tasks4.Student " + name + " " + surname + " enrolled the course");
    }

    void startStudy() {
        out.println("Tasks4.Student's " + name + " " + surname + " study started");
    }

    void finishStudy() {
        out.println("Tasks4.Student's " + name + " " + surname + " study finished");
    }

    void getScore() {
        out.println("Tasks4.Student " + name + " " + surname + " get 100 score");
    }
    void graduate(){
        System.out.println("Tasks4.Student " + name + surname + " is graduated ");
    }

    public String setName(String nameInput) {
        return name = nameInput;
    }

    public String getName() {
        return name;
    }

    public String setSurname(String surnameInput) {
        return surname = surnameInput;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public void drinkBeer() {

    }

    @Override
    public void playGames() {

    }
}

