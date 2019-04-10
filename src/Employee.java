import java.io.Serializable;

public class Employee implements Serializable {
    private int eno;
    private String ename;
    private double sal;
    private String desg;
    private transient Company company=new Company();

    public Employee(int eno, String ename, double sal, String desg) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
        this.desg = desg;
    }
    
    public void showInfo(){
        System.out.println("_____________________________");
        System.out.println("ECode  : "+eno);
        System.out.println("EName  : "+ename);
        System.out.println("Salary : "+sal);
        System.out.println("Desg   : "+desg);
        System.out.println("_____________________________");
    }
}
