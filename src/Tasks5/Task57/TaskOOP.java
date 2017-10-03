package Tasks5.Task57;
import Interfaces.IChillable;
import Interfaces.IWorkable;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
public class TaskOOP {
    public static void main(String args[]) {
        PhdStudent phdStudent = new PhdStudent();
        MasterStudent masterStudent = new MasterStudent();
        IChillable chillable = phdStudent;
        chillable.playGames(4);
        chillable.drinkBeer(4);
        IWorkable workable = masterStudent;
        workable.work(8);
        workable.getPaid(100);
        Student student = new Student();
        student.drinkBeer(5);
        student.playGames(5);
    }

}