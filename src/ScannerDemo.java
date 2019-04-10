
import java.util.Scanner;


public class ScannerDemo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("What is your name : ");
        String name=sc.next();
        System.out.println("What is your age : ");
        int age=sc.nextInt();
        
        System.out.println("Your Name : "+name);
        System.out.println("Your Age  : "+age);
        
    }

}
