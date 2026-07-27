package solid.openclose.goodexample;

public class CardPayment implements Payment {

    @Override
    public String paymentMethod(String type) {
        return "payment is done by card";
    }

    
    
}
