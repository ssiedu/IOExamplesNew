
import java.io.File;
import java.io.IOException;


public class FileTwo {

    public static void main(String[] args) throws IOException {
        
        /*
          //Code for creating and deleting file/folder
        //File f=new File("e:/io/info.txt");
        //boolean b1=f.mkdir();
        //boolean b1=f.delete();
        */
        
        /*
        //Code For Renaming
        File f1=new File("e:/io/data.txt");
        File f2=new File("e:/io/info.txt");
        boolean b1=f1.renameTo(f2);
        */
        
        File f=new File("e:/io/trial.txt");
        boolean b1=f.createNewFile();
        
        
        
        
        
        if(b1==true){
            System.out.println("Operation Success");
        }else{
            System.out.println("Operation Failed");
        }


    }

}
/*
    //methods to perform basic file operations
    ---------------------------------------------

    boolean mkdir()
    boolean delete()
    boolean renameTo(File)
    boolean createNewFile()









*/
