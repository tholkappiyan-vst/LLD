interface Tea{
    public void makeTea();
            
    
}
class NormalTea implements Tea{

    @Override
    public void makeTea() {
        System.out.println("Normal Tea");
    }
    
}

abstract class TeaDecorator implements Tea{
    Tea tea;
    TeaDecorator(Tea tea){
        this.tea=tea;
    }

}

class ExtraSugar extends TeaDecorator{

   
    ExtraSugar(Tea tea){
        super(tea);
    }

    @Override
    public void makeTea() {
        tea.makeTea();
        System.out.println("with extra sugar");
      
    }
    
}

class ExtraMilk extends TeaDecorator{

   
    ExtraMilk(Tea tea){
        super(tea);
    }

    @Override
    public void makeTea() {
        tea.makeTea();
        System.out.println("with extra Milk");
      
    }
    
}
public class Main{
        public static void main(String[] args){

            Tea tea=new NormalTea();
            tea.makeTea();

            Tea sugarTea= new ExtraSugar(tea);
            sugarTea.makeTea();

            Tea milkSugarTea =new ExtraMilk(new ExtraSugar(tea));
           milkSugarTea.makeTea();



        }
}