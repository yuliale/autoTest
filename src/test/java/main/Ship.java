package main;

/**
 * Created by yuliale on 12/2/2014.
 */
public class Ship {
    double weight=650;
    int length=400;
    String title="CaptainJack";
    String type="navy";
    boolean nuclear=false;

    public Ship(double weight, int length, String title, String type, boolean nuclear) {
        this.weight=weight;
        this.length=length;
        this.title=title;
        this.type=type;
        this.nuclear=nuclear;
    }


}
