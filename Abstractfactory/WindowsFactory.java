public class WindowsFactory implements AbstractFactory {

    @Override
    public Box addBox() {
        return new WindowBox();
        
    }

    @Override
    public Buttons addButton() {
        return new WindowButtons();
        
    }
    
}
