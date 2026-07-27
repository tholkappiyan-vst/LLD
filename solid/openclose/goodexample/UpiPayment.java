package solid.openclose.goodexample;

public class UpiPayment implements Payment{
    
  
    @Override
    public String paymentMethod(String type) {
        return " payment is done by upi methods ";
    }
}
