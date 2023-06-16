public class Fish extends Animal { //dog is an Animal
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }



    @Override
    public void Move(String speed) {
       if(speed.equalsIgnoreCase("Slow")){
           System.out.println(getExplicitType() + " lazily swimming");
       }else{
           System.out.println(getExplicitType() + " darting frantically");
       }
    }

    @Override
    public void MakeNoise() {
          if(type.equalsIgnoreCase("Goldfish")){
              System.out.print("Swish ");
          }else{
              System.out.print("Splash ");
          }
    }


}
