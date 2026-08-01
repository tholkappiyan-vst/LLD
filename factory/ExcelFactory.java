

public class ExcelFactory extends Factory {

    @Override
    public Document create() {
        return new ExcelDocument();
    }
    
}
