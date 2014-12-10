package main;

/**
 * Created by yuliale on 12/2/2014.
 */
  class Boat extends Ship {
    String name;

    public Boat(double weight, int length, String title, String type, boolean nuclear, String name) {
        super(weight, length, title, type, nuclear);
        this.name=name;


    }
}
