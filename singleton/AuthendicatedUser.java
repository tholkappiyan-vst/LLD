

public class AuthendicatedUser{

    private static String name;
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AuthendicatedUser.name = name;
    }

    public static void setId(long id) {
        AuthendicatedUser.id = id;
    }

    public static long getId() {
        return id;
    }

    private static long id;

    private static AuthendicatedUser singleobject=null;

    private AuthendicatedUser(){}

    public static AuthendicatedUser getObject(){
        if(singleobject==null) return new AuthendicatedUser();

        return singleobject;
    }



}