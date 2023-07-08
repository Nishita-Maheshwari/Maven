package in.sp.main;

import java.util.Scanner;

import in.sp.services.RegService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("------------Register Here-------------");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Name");
        String name = scanner.next();
        
        System.out.println("Enter Email");
        String email = scanner.next();
        
        System.out.println("Enter Password");
        String pass = scanner.next();
        
        System.out.println("Enter City");
        String city = scanner.next();
        
        RegService rs = new RegService();
        boolean status = rs.registerService(name, email, pass, city);
        if(status)
        {
        	System.out.println("Registration Success");
        }
        else
        {
        	System.out.println("Registration Failed");
        }
    }
}