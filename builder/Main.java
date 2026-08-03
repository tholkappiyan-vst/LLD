public class Main {

    public static void main(String[] inputs){
        HttpRequest req1=new HttpRequest.Builder("https://localhost:8080/get").build();
        req1.printMyObject();
        HttpRequest req2=new HttpRequest.Builder("https://localhost:8080/get").addDate("3/8/26").build();
         req2.printMyObject();

         /* the output will be like
         https://localhost:8080/get null null
         https://localhost:8080/get 3/8/26 null
          */

    }
    
}
