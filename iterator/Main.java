interface Iterator{
    public boolean hasNext();
    public void next();
}
interface Iterable{
    public Iterator create();
}
class PlayListIterator implements Iterator{
    int index=0;

    @Override
    public boolean hasNext() {
        index++;
        return index<=2;
    }

    @Override
    public void next() {
       if(hasNext()) System.out.println("verdict");
       else System.out.println("No");
    }
    
}
class PlayList implements Iterable{

    @Override
    public Iterator create() {
       return new PlayListIterator();
    }
    
}
public class Main{

    public static void main(String[] args){

        PlayList playlist=new PlayList();
        Iterator itr=playlist.create();
        itr.next();
        itr.next();
        itr.next();
        itr.next();
 Iterator itr1=playlist.create();
            
 itr1.next();
 itr1.next();
 itr1.next();
 itr1.next();
 itr1.next();

 /*
verdict
verdict
No
No
verdict
verdict
No
No
No
  */
        
    }

}