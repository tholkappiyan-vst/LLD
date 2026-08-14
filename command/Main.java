import java.util.Stack;

interface Order{
    public void execute();
    public void undo();
}
class FoodOrdered implements Order{

    @Override
    public void execute() {
       System.out.println("order is Placed");
    }

    @Override
    public void undo() {
        System.out.println(" order is cancelled");
    }
    

}
class FoodCancelled implements Order{

    @Override
    public void execute() {
        System.out.println("order is cancelled");
    }

    @Override
    public void undo() {
        System.out.println("order is placed");
    }
    
}
class Service{

    Stack<Order> st=new Stack<>();

    public void executeCommand(Order order){
            order.execute();
            st.push(order);
    }
    public void undoCommand(Order order){

        if(!st.isEmpty()){
            st.pop().undo();
        }

    }



}

public class Main{
    public static void main(String[] args){
        FoodOrdered food=new FoodOrdered();
        FoodCancelled foodcancel=new FoodCancelled();
        Service service=new Service();
        service.executeCommand(food);
        service.undoCommand(food);
        service.executeCommand(foodcancel);
        service.undoCommand(foodcancel);

/*
order is Placed
order is cancelled
order is cancelled
order is placed
 */
        

        





    }
}