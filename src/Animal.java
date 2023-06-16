


abstract class Mammal extends Animal{

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void Move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equalsIgnoreCase("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}


public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    // You can not write something inside {} in an abstract method and the method can not be private

    public abstract void Move(String speed);
    public abstract void MakeNoise();

    //final methods can not be overriden in children classes
    public final String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ")";
    }



}
