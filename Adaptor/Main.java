interface Target{
    public void turnon();
    public void turnoff(); 
}
 class CompanyAFan{
    public void start(){
        System.out.println("fan is turned on");
    }

    public void stop(){
        System.out.println("fan is turned off");
    }

}

class CompanyBFan{
    public void on(){
        System.out.println("fan is turned on");
    }

    public void off(){
        System.out.println("fan is turned off");
    }

}

class CompanyAAdaptor implements Target{

    CompanyAFan obj;

    CompanyAAdaptor(CompanyAFan obj){
        this.obj=obj;
    }

    @Override
    public void turnon() {
        obj.start();
    }

    @Override
    public void turnoff() {
       obj.stop();
    }

}

class CompanyBAdaptor implements Target{

    CompanyBFan obj;

    CompanyBAdaptor(CompanyBFan obj){
        this.obj=obj;
    }

    @Override
    public void turnon() {
        obj.on();
    }

    @Override
    public void turnoff() {
       obj.off();
    }

}

public class Main{

    public static void main(String[] args){

        Target fan=new CompanyAAdaptor(new CompanyAFan());
        fan.turnon();
        fan.turnoff();
        Target fan1=new CompanyBAdaptor(new CompanyBFan());
        fan1.turnon();
        fan1.turnoff();
    }

}