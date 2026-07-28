public class Main {

    public static void main(String[] args){

        AuthendicatedUser object1=AuthendicatedUser.getObject();
        object1.setName("tholkappiyan");
        object1.setId(242);
        System.out.println("name-->"+object1.getName());
        System.out.println("Id-->"+object1.getId());


         AuthendicatedUser object2=AuthendicatedUser.getObject();

         System.out.println("name-->"+object2.getName());
        System.out.println("Id-->"+object2.getId());




    }
    
}
