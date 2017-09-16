package Tasks5;

import Interfaces.*;

/**
 * Created by pavlo.balyuk on 9/6/2017. From task 5.2.a and 5.2.b Automation testing course
 */
public class MasterStudent extends StudentImproved implements IWorkable {
    public MasterStudent() {

    }
    public MasterStudent(String nameInput, String surnameInput) {
        super(nameInput, surnameInput);
    }

    void graduate() {
        System.out.println("Msc student " + name + " " + surname + " graduated");
    }

    @Override
    public void work(int hours) {

    }

    @Override
    public void getPaid(double money) {

    }

    @Override
    public void drinkBeer(int liters) {

    }

    @Override
    public void playGames(int hours) {

    }
}
