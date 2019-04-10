
import java.io.FileInputStream;

public class ReadFile {
    public static void main(String args[]) throws Exception {
        //reading the file data.txt
        //reading multiple bytes together
        FileInputStream fis=new FileInputStream("e:/java6/Demo.java");
        
        int size=fis.available();//finding the no bytes available in stream
        
        byte b[]=new byte[size]; //creating a array
        
        fis.read(b); //reading the data and storing to array
        String s=new String(b);//converting bytes to string
        System.out.println(s);
        
        
        
        /*
        //READ ONE-BY-ONE BYTE
        //1) Open a stream
        //FileInputStream fis=new FileInputStream("e:/io/data.txt");
        FileInputStream fis=new FileInputStream("e:/java6/Demo.java");
        //2) Read the data from stream
        
        while(true){
        int n=fis.read();   
        if(n==-1)break;
        System.out.print((char)n);
        }
        
        //3) close the file
        fis.close();
        */
    }
}
