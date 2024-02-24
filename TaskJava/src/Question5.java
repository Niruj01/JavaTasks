import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner purchaseAmnt = new Scanner(System.in);
		System.out.println("Enter your Purchase Amount ");
		
		int purAmnt = purchaseAmnt.nextInt();
		
		if(purAmnt<=500) {
			System.out.println("Sorry!There is No Discount");
			
		}else if(purAmnt>500 && purAmnt<1000) {
			int disAmnt = (purAmnt*10)/100;
			purAmnt = purAmnt - disAmnt;
		}else {
			int disAmnt = (purAmnt*20)/100;
			purAmnt = purAmnt - disAmnt;
		}
		System.out.println(" Your Final Amount is "+purAmnt);

	}

}
