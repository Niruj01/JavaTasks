
public class Question6 {

	public static void main(String[] args) {
		for(int i=5;i>0;i--) {
			if(i<5) {
			System.out.println();
			}
			for(int j=5;j>0;j--) {
				if(j<=i) {
				System.out.print(i+" ");
				}else if(j>i) {
				System.out.print(j+" ");
				}
			}
		}

	}

}
