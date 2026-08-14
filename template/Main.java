abstract class Flow{

    public void startAday(){
        bus();
        school();
        exam();
        salary();

    }
      
    public void bus(){
        System.out.println("1.get their bus");
    }
    public void school(){
        System.out.println("2.reach their school");
    }

    public abstract  void exam();

    public void salary(){
        
    }


    

}

class Student extends Flow{

    @Override
    public void exam() {
        System.out.println("student can write a exam");
    }
    
}

class Teacher extends Flow{

    @Override
    public void exam() {
      System.out.println("Teacher can evaluates exam");
    }
    
    public void salary(){
        System.out.println("Teacher can get their salary");
    }
    
}


public class Main {

    public static void main(String[] args){
            Flow s=new Student();
            s.bus();
            s.school();
            s.exam();
            s.salary();

            Flow t=new Teacher();
            t.bus();
            t.school();
            t.exam();
            t.salary();
    }
    
}

/*

1.get their bus
2.reach their school
student can write a exam
1.get their bus
2.reach their school
Teacher can evaluates exam
Teacher can get their salary

*/
