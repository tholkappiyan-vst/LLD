
interface State{
    public void entercar(Car car);
    public void exitcar(Car car);
    public void startcar(Car car);
    public void offcar(Car car);
}

class Outside implements State{

    @Override
    public void entercar(Car car) {
        System.out.println("the person can enter to car");
        car.setState(new Inside());
    }

    @Override
    public void exitcar(Car car) {
        System.out.println("before exit the car , you should enter the car");
    }

    @Override
    public void startcar(Car car) {
      System.out.println(" before start the car, you should enter the car first");
    }

    @Override
    public void offcar(Car car) {
       System.out.println("before off the car, you should enter the car first");
    }

}
class Inside implements State{

    @Override
    public void entercar(Car car) {
       System.out.println("you are already inside a car");
    }

    @Override
    public void exitcar(Car car) {
       System.out.println("you can exit now");
       car.setState(new Outside());
    }

    @Override
    public void startcar(Car car) {
        System.out.println("you can start the car");
        car.setState(new Driving());
    }

    @Override
    public void offcar(Car car) {
      
     System.out.println("before the off the car, you can start the car");
    }
    
}

class Driving implements State{

    @Override
    public void entercar(Car car) {
       System.out.println("you are already inside a car");
       
    }

    @Override
    public void exitcar(Car car) {
        System.out.println("before exit car , you should off the car");
    }

    @Override
    public void startcar(Car car) {
        System.out.println("you already started car");
      
    }

    @Override
    public void offcar(Car car) {
       System.out.println("you can off the car");
       car.setState(new Inside());
    }

}

class Car{
    State state;

    Car(){
        this.state=new Outside();
    }

    public void setState(State s1){
        this.state=s1;
    }

    public void entercar(){
        state.entercar(this);

    }
    public void exitcar(){
        state.exitcar(this);

    }
    public void startcar(){

        state.startcar(this);
    }
    public void offcar(){
        state.offcar(this);

    }


}
public class Main {

    public static void main(String[] args){

        Car car=new Car();
        car.startcar();
        car.entercar();
        car.startcar();
        car.offcar();
        car.exitcar();
        car.exitcar();



    }
    
}
