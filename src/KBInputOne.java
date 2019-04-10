
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class KBInputOne {
    public static void main(String[] args) throws Exception {

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter Your Name : ");
        String name=br.readLine();
        System.out.println("Enter Your Age : ");
        int age=Integer.parseInt(br.readLine());
        
        System.out.println("Your Name : "+name);
        System.out.println("Your Age  : "+age);
        
        
    }
}
