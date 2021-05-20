import animal.*;
import edible.*;
public class EdibleTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal:animals){
            String sound = animal.makeSound();
            System.out.println(sound);

            //Instance of: Check xem một đối tượng có phải thể hiện của một lớp thực tế hay không
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}