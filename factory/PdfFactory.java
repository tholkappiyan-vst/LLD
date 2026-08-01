

public class PdfFactory extends Factory {

    @Override
    public Document create() {
       return new PdfDocument();
    }
    
}
