


class RealObject{
    String name;

    RealObject(String name){
        System.out.println("this is Realobject of "+name+" , time take will be so high while creating this object");
    }

    
}

class ProxyObject{
        String name;
        ProxyObject(String name){
            this.name=name;
        }
        public void getObjectName(){
            System.out.println(name);
        }

        public void createObject(){
            new RealObject(name);
        }

}


public class Main{
    public static void main(String[] args){

        ProxyObject obj=new ProxyObject("file1");
        obj.getObjectName();
        obj.createObject();


    }
}