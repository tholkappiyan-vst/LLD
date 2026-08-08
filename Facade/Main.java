 class Checker{

   boolean checkrooms(int roomno){
    return true;
   }

}
class Booker{

    void book(int roomno){
        System.out.println(roomno+" room is booked");
    }

}

 class Helper{
    Checker checker=new Checker();
    Booker booker=new Booker();

    public void bookRoom(int roomno){
       if (checker.checkrooms(roomno)){
        booker.book(roomno);
       }

    }

}

public class Main{

    public static void main(String[] args){

        Helper helper=new Helper();
        helper.bookRoom(100);



    }
}