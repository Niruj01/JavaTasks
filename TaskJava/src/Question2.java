import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner Num = new Scanner(System.in);
		System.out.println("Enter your Input Number ");
		
		long NumRes = Num.nextLong();
		
		if(NumRes>0) {
			System.out.println("Your Input Number is Positive");
		}else {
			System.out.println("Your Input Number is Negative");
		}
		
	}

}
