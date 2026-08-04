public class MacFactory implements AbstractFactory {

    @Override
    public Box addBox() {
        return new MacBox();
        
    }

    @Override
    public Buttons addButton() {
        return new MacButtons();
        
    }
    
}
