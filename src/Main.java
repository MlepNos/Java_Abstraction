import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //We Can not create an instance of an abstract class
        //Animal animal = new Animal("animal","big",100);
        Dog dog = new Dog("Wolf","big",100);
        dog.MakeNoise();
        doAnimalStuff(dog);

        System.out.println("-".repeat(30));

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("Shepard","big",150));
        animals.add(new Fish("goldfish","small",3));
        animals.add(new Fish("Tuna","big",70));
        animals.add(new Dog("Pug","small",30));
        animals.add(new Horse("Clydesdale","large",1000));
        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }



    }

    private static void doAnimalStuff(Animal animal){
        animal.MakeNoise();
        animal.Move("Slow");

    }



    ////////////////////// Challange Main Start //////////////////////
}














