 import java.util.*;
class HttpRequest{

   private String url;
   private HashMap<String,String> header;
   private  HashMap<String,String> body;
   private  String date;
   private  String bearerToken;

   private  HttpRequest(Builder builder) {
    this.url = builder.url;
    this.header = builder.header;
    this.body = builder.body;
    this.date = builder.date;
    this.bearerToken = builder.bearerToken;
   }

   public void printMyObject(){
    System.out.println(url+" "+date+" "+bearerToken);
   }

    public static class Builder{

    public  String url;
   public  HashMap<String,String> header=new HashMap<>();
   public   HashMap<String,String> body=new HashMap<>();
   public   String date;
   public   String bearerToken;

   public Builder(String url){
    this.url=url;
   }

   public Builder addHeader( HashMap<String,String> header){
    this.header=header;
    return this;
   }
   public Builder addBody( HashMap<String,String> body){
    this.body=body;
    return this;
   }

   public Builder addDate(String date){
    this.date=date;
    return this;

   }

   public Builder addbearerToken(String bearerToken){
    this.bearerToken=bearerToken;
    return this;
   }

   public HttpRequest build(){
    return new HttpRequest(this);
   }



    }
   
}