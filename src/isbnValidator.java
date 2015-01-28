import java.util.Scanner;

public class isbnValidator {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int isbn =  s.nextInt();
		int weightedTotal= 0;
		for (int i = 0 ; i <10; i++){
			weightedTotal+= isbn%10 * (i+1);
			isbn = isbn/10;
		}
		
		System.out.print(weightedTotal % 11 == 0);
	}
}
