import Interfaces.*;

/**
 * Created by pavlo.balyuk on 9/6/2017. From task 5.2.a and 5.2.b Automation testing course
 */
public class MasterStudent extends StudentImproved implements IWorkable {

    void graduate() {
        System.out.println("Student " + name + " " + surname + " graduated");
    }

    @Override
    public void work() {

    }

    @Override
    public void getPaid() {

    }

    @Override
    public void drinkBeer() {

    }

    @Override
    public void playGames() {

    }
}
