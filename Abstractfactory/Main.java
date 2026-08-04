public class Main {
        public static void main(String[] args){

            AbstractFactory factory = new WindowsFactory();
            factory.addBox().clickBox();
            factory.addButton().clickButton();

            AbstractFactory factory1 = new MacFactory();
            factory1.addBox().clickBox();
            factory1.addButton().clickButton();
        }

        /*
        windows box is clicked
windowsButtons is clicked
MacButtons is clicked
MacButtons is clicked
         */
    
}
