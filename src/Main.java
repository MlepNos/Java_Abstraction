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





/*
In this challenge, you need to build an application, that can be a store front, for any imaginable item for sale.
Instead of the Main class we usually create, create a Store class, with a main method.
The Store class should:
-manage a list of products for sale, including displaying the product details.
-manage an order, which can just be a list of OrderItem objects.
-have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt.

Create a ProductForSale class that should have at least three fields: a type, price, and a description, and should have methods to:
-get a Sales Price, a concrete method, which takes a quantity, and returns the quantity times the price.
-print a Priced Line Item, a concrete method, which takes a quantity, and should print an itemized line item for an order,
with quantity and line item price.
-show Details, an abstract method, which represents what might be displayed on a product page, product type, description, price, and so on.
Create an OrderItem type, that has at a minimum 2 fields, quantity and a Product for Sale.
You should create two or three classes that extend the ProductForSale class, that will be products in your store.
See the class diagram "Challange_Abstraction.png"
 */








