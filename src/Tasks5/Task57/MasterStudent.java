package Tasks5.Task57;

import Interfaces.*;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
public class MasterStudent extends Student implements IWorkable {

    @Override
    public void work(int hours) {
        out.print("MasterStudent student worked for " + hours + "\n");
    }

    @Override
    public void getPaid(double money) {
        out.print("MasterStudent student earned " + money + "$$\n");
    }

    @Override
    public void drinkBeer(int liters) {
        out.print("MasterStudent student drink for " + liters + "\n");
    }

    @Override
    public void playGames(int hours) {
        out.print("MasterStudent student played games for " + hours + "\n");
    }
}

