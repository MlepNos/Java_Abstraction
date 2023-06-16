public class Dog extends Mammal { //dog is an Animal
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void Move(String speed) {
       if(speed.equalsIgnoreCase("Slow")){
           System.out.println(getExplicitType() + " walking");
       }else{
           System.out.println(getExplicitType() + " running");
       }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds all the time");
    }

    @Override
    public void MakeNoise() {
          if(type.equalsIgnoreCase("Wolf")){
              System.out.print("Howling ");
          }else{
              System.out.print("Woof ");
          }
    }


}
