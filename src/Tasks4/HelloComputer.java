package Tasks4;

/**
 * Created by pavlo.balyuk on 8/29/2017.
 */
public class HelloComputer {
    public static void main (String[] args) {
        Computer comp = new Computer(20);
        comp.setRam(25);
        System.out.println(comp.getRam());
    }
}
