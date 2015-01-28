import java.util.Scanner;

public class bankNumbers {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter your three line bank number");
		for(int i =0; i<3;i++){
			System.out.print(i+": ");
			String input = s.nextLine();
			transform(input);
		}
	}
	public static void transform(String bankNumber){
	
		String upper = " _     _  _     _  _  _  _  _ ";
		String middle ="| | |  _| _||_||_ |_ | ||_||_|";
		String lower = "|_| | |_  _|  | _||_|  ||_| _|";
		
		String firstRow ="";
		String secondRow ="";
		String thirdRow= "";
		
		for(int i=0; i<bankNumber.length();i++){
			int temp = bankNumber.charAt(i)-48;
			
			firstRow+=upper.substring(temp*3,(temp+1)*3);
			secondRow+=middle.substring(temp*3,(temp+1)*3);
			thirdRow+=lower.substring(temp*3,(temp+1)*3);
			
			
		}
		
		System.out.println(firstRow);
		System.out.println(secondRow);
		System.out.println(thirdRow);
		
		
	}
}
