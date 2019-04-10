import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveEmpInfo {
    public static void main(String[] args) throws Exception {

        Employee e=new Employee(111, "AAA", 50000, "Manager");
        e.showInfo();
        
        //storing an object to a file
        FileOutputStream fos=new FileOutputStream("e:/io/empobj.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e);
        oos.close(); fos.close();
        System.out.println("Object Successfully Stored");
        
    }
}
