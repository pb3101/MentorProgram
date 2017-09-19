package Tasks5.Task57;

import Interfaces.IChillable;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
public class Student implements IChillable {
    @Override
    public void drinkBeer(int liters) {
        out.print("Student student drink for " + liters + "\n");
    }

    @Override
    public void playGames(int hours) {
        out.print("Student student played games for " + hours + "\n");
    }
}
