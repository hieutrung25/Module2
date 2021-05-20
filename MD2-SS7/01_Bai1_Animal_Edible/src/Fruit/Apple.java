package Fruit;

import edible.Edible;

public class Apple extends Fruit implements Edible {
    public String howToEat(){
        return "Apple could be slided";
    }
}