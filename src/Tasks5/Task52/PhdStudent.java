package Tasks5.Task52;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class PhdStudent extends Student {

    protected void defendThesis() {
        System.out.println("Phd student's " + name + surname + " defend Thesis is brilliant! ");
    }

    protected void graduate() {
        System.out.println("Phd student's " + name + surname + " defend Thesis and graduated ");
    }
}
