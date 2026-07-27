package solid.liskovsubstitution;

public class Main {
    public static void main(String[] args){

        Human vst=new Human();
        vst.Talking();
        vst.Eating();
      //  vst.Flying(); --->  this is not possible 
      Birds sparrow =new Birds();
      sparrow.Flying();
      sparrow.Eating();
    //  sparrow.Talking(); ----> this is not possible 

    }
    
    
}
