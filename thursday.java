import java.util.Scanner;

public class thursday {
    
    private static String vaccination;

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        String name;
        int age;
        String vaccinaion;

        

        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your age");
        age=sc.nextInt();
        System.out.println("Enter vaccination name ");
        vaccinaion=sc.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Vaccinaion " + vaccination);
   
        
    
        
    }
}
