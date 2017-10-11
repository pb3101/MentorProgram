package Tasks4;

/**
 * Created by pavlo.balyuk on 8/29/2017.
 */
class Computer {
    String procType;
    int ram;
    double hdd;

    Computer (int ramInput) {
        ram = ramInput;
    }

    Computer (String procTypeInput, double hddInput) {
        procType = procTypeInput;
        hdd = hddInput;
    }

    Computer (String procTypeInput, int ramInput, double hddInput) {
        procType = procTypeInput;
        ram = ramInput;
        hdd = hddInput;
    }

    public String getProcType () {
        return procType;
    }

    public double getHdd () {
        return hdd;
    }

    public int getRam () {
        return ram;
    }

    public int setRam (int ramInput) {
        return ram = ramInput;
    }
}
