import java.util.Scanner;
public class destringifcation {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(destring(input));
	}
	public static String destring(String input){
		if(input.charAt(0)!='"' || input.charAt(input.length()-1)!= '"' || input.length()<2){
			return "invalid string";
		}
		input = input.substring(1,input.length()-1);
		for(int i=0; i<input.length();i++){
			if (input.charAt(i) == '\\'){
				if(input.charAt(i+1) == '"'){
					input = input.substring(0,i) + input.substring(i+1, input.length());
				}
				else if(input.charAt(i+1)=='n'){
					input = input.substring(0,i) + "\n" + input.substring(i+2, input.length());
				}
				else{
					input = "invalid use of escape";
					break;
				}
			}
		}
		return input;
		
	}
}
