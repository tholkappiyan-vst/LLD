package solid.single;

class Main{

    public static void main(String[] args){

        Students s1=new Students();
       System.out.println( s1.writeExam());
       System.out.println( s1.writeTest());
        Teachers t1=new Teachers();
        System.out.println(t1.EvaluateExamorTest());


    }
}