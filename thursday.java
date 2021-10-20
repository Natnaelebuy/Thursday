import java.util.Scanner;

public class thursday {
    
    

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        
        String name;
        int age;
        String medical;

        

        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your age");
        age=sc.nextInt();
        System.out.println("Enter vaccination name ");
        medical=sc.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println(" your booster vaccination is " + medical);
   
        
    
        
    }
}
