

public class AuthendicatedUser1{

    private static String name;
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AuthendicatedUser1.name = name;
    }

    public static void setId(long id) {
        AuthendicatedUser1.id = id;
    }

    public static long getId() {
        return id;
    }

    private static long id;

    private static AuthendicatedUser1 singleobject=null;

    private AuthendicatedUser1(){}

    public static AuthendicatedUser1 getObject(){
        if(singleobject==null){
            synchronized(AuthendicatedUser1.class){
             if(singleobject==null)
            return new AuthendicatedUser1();
            }

        } 

        return singleobject;
    }



}