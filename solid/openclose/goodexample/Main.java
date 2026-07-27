package solid.openclose.goodexample;

public class Main {
    public static void main(String[] args){

        UpiPayment up= new UpiPayment();
        System.out.println(up.paymentMethod("upi"));
        CardPayment cp=new CardPayment();
        System.out.println(cp.paymentMethod("card"));



    }
    
}
