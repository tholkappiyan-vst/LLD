import java.util.ArrayList;
import java.util.List;

interface FileSystem{

    public void getName();
    public void getSize();
    public void getStructure();
    
}

class File implements FileSystem{
    String name;
    int size;
     
    public File(String name, int size) {
        this.name = name;
        this.size = size;
        
    }

    @Override
    public void getName() {
       System.out.println("file name is"+" "+ name);
    }

    @Override
    public void getSize() {
      System.out.println("file size is"+" "+size);
    }

    @Override
    public void getStructure() {
        System.out.println("file"+" "+name+" (" + " "+size+" )");
    }
    
}

class Folder implements FileSystem{

    String name;
    List<FileSystem> list;

    Folder(String name){
        this.name=name;
        list=new ArrayList<>();
    }

    
    
    public void add(FileSystem obj){
        list.add(obj);
    }
    @Override
    public void getName() {

        System.out.println(name);       
    }

    @Override
    public void getSize() {
        for(FileSystem obj : list){
            obj.getSize();
        }
    }

    @Override
    public void getStructure() {
        System.out.println(name);

        for(FileSystem obj : list){
            obj.getStructure();
        }
    }
    
}




public class Main {
        public static void main(String[] args){

            File f1=new File("file1",2);
            File f2=new File("file2",3);

            Folder fl1=new Folder("folder1");
            fl1.add(f1);
            fl1.add(f2);

            Folder fl2=new Folder("folder2");
            fl2.add(fl1);

            fl2.getStructure();
           // fl2.getSize();

        }  

}
