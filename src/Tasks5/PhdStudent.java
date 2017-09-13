package Tasks5;

import Interfaces.*;

/**
 * Created by pavlo.balyuk on 9/6/2017. From task 5.2.a and 5.2.b Automation testing course
 */
public class PhdStudent extends StudentImproved implements IWorkable {
    public  PhdStudent(){

    }
    /**Task 5.5.d Automation testing course here*/
    public PhdStudent(StudentImproved studentImproved) {
            super(studentImproved);
    }
    public  PhdStudent(String nameInput, String surnameInput){
            super(nameInput, surnameInput);
    }
    /**Task 5.5.d Automation testing course here*/
    void defendThesis(){
        System.out.println("Phd student's " + name + surname + " defend Thesis is brilliant! ");
    }
    void graduate(){
          System.out.println("Phd student's " + name + surname + " defend Thesis and graduated ");
    }

    @Override
    public void work() {

    }

    @Override
    public void getPaid() {

    }
}
