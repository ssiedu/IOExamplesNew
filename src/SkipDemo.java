
import java.io.FileInputStream;

public class SkipDemo {
public static void main(String[] args) throws Exception {
   
    
    FileInputStream fis=new FileInputStream("e:/io/data.txt");
    
    System.out.println(fis.markSupported());
    
    System.out.println((char)fis.read());
    System.out.println((char)fis.read());
    System.out.println((char)fis.read());
    System.out.println((char)fis.read());
    System.out.println((char)fis.read());
    fis.skip(3);//F,G,H->I
    System.out.println((char)fis.read());
    System.out.println((char)fis.read());
    System.out.println((char)fis.read());
    fis.skip(2);//L,M->N
    System.out.println((char)fis.read());
    System.out.println((char)fis.read());
    
    
    
}
    
}
