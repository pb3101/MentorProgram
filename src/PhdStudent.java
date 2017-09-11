import Interfaces.*;

/**
 * Created by pavlo.balyuk on 9/6/2017. From task 5.2.a and 5.2.b Automation testing course
 */
public class PhdStudent extends StudentImproved implements IWorkable {
    public  PhdStudent(){

    }
    /**Task 5.5.d Automation testing course here*/
    public PhdStudent(/*String name, String surname */StudentImproved studentImproved) {
       super(/*name,surname*/studentImproved);
    }
    /**Task 5.5.d Automation testing course here*/
    void defendThesis(){
        System.out.println("Student's " + name + surname + " defend Thesis is brilliant! ");
    }
    void graduate(){
          System.out.println("Student " + name + surname + " defend Thesis and graduated ");
    }

    @Override
    public void work() {

    }

    @Override
    public void getPaid() {

    }
}
