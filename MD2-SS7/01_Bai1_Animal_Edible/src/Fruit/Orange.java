package Fruit;

import edible.Edible;

public class Orange extends Fruit implements Edible {
    public String howToEat() {
        return "Orange could be juice";
    }
}