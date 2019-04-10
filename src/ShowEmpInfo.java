
import java.io.FileInputStream;
import java.io.ObjectInputStream;


//reading an object from file empobj.txt
public class ShowEmpInfo {
    public static void main(String args[]) throws Exception {
        FileInputStream fis=new FileInputStream("e:/io/empobj.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee emp=(Employee) ois.readObject();
        emp.showInfo();
        ois.close(); fis.close();
    }
}
