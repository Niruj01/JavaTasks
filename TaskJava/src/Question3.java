
public class Question3 {

	public static void main(String[] args) {
		int inputNum = 876;
		int revNum = 0;
		int quotient = inputNum;
		while(quotient>1) {
			int remainder= quotient%10;
			quotient= quotient/10; 
			revNum = (revNum * 10) + remainder;
		}
		System.out.println(revNum);

	}

}
