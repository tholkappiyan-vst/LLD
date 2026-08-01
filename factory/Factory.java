

public abstract class Factory {

    public abstract Document create();

    public void openDocument(){

        Document doc=create();
        doc.open();
    }
    
}
