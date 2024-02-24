import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
        int a, b, c; 
        Scanner inNum = new Scanner(System.in); 
        System.out.print("Enter the first number:"); 
        a = inNum.nextInt(); 
        System.out.print("Enter the second number:"); 
        b = inNum.nextInt(); 
        System.out.print("Enter the third number:"); 
        c = inNum.nextInt(); 
        
        if(a<b && a<c) {
        	System.out.println(a+" is the Smallest Number");
        }else if(b<a && b<c) {
        	System.out.println(b+ "  is the Smallest Number");
        }else {
        	System.out.println(c+ " is the Smallest Number");
        }
        

	}

}
