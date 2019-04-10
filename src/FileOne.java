import java.io.File;


public class FileOne {
    public static void main(String[] args) {
        //File f1=new File("e:/java6/Test.java");
        File f1=new File("e:/io/data.txt");
        boolean b1=f1.exists();
        System.out.println("Exits : "+b1);
        boolean b2=f1.isFile();
        System.out.println("isFile : "+b2);
        long val=f1.length();
        System.out.println("Length : "+val);
        boolean b3=f1.canWrite();
        System.out.println("CanWrite : "+b3);
        boolean b4=f1.isHidden();
        System.out.println("isHidden : "+b4);
        boolean b5=f1.canExecute();
        System.out.println("canExecute : "+b5);
        
        long v=f1.lastModified();
        System.out.println(v);
        
        java.util.Date dt=new java.util.Date(v);
        System.out.println(dt);
        
        System.out.println("___________________________");
        File f2=new File("e:/java6");
        String s[]=f2.list();
        for(String tmp:s){
            System.out.println(tmp);
        }
        
        
        
        
        
    }
}
/*
    (non-static)

    long lastModified()
    long length()
    boolean exists()
    boolean isFile()
    boolean isDirectory()
    boolean canWrite()
    boolean isHidden()
    String[] list()





*/
