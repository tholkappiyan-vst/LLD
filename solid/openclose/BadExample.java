package solid.openclose;

public class BadExample {

    public String PaymentMethod(String type){

        if(type.equals("upi")) return "payment is done by upi";
        else if(type.equals("card")) return "payment is done by card";
        return "payment is done by cash";
        }

    
}
