import java.util.Scanner;

public class thursday {
    
    

    public static void main(String[] args) {

        /// The vaccinations are "pfizer-alpha", "moderna-alpha", "johnson-alpha", "pfizer-omega", "pfizer-kappa", "moderna-delta", "moderna-gamma", "moderna-zeta"

        Scanner sc=new Scanner (System.in);
        
        String name, medical;
        int age;
        

        

        System.out.println("Please Enter your name");
        name=sc.next();
        System.out.println("Please Enter your age");
        age=sc.nextInt();
        System.out.println("Please Enter vaccination name ");
        medical=sc.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("your booster vaccination is " + medical);
   
        
    
        
    }
}
