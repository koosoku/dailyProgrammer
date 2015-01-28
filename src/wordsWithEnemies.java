
public class wordsWithEnemies {
	public static void main(String[] args){
		
		contact("because","cause");
		
	}
	public static void contact(String leftWord, String rightWord){
		
		int leftScore = leftWord.length();
		int rightScore = rightWord.length();
		
		for(int i =0; i<leftWord.length();i++){
			for(int j = 0; j<rightWord.length();j++){
				if(leftWord.charAt(i)==rightWord.charAt(j)){
					leftWord = leftWord.substring(0,i) + leftWord.substring(i+1,leftWord.length());
					rightWord = rightWord.substring(0,j) + rightWord.substring(j+1,rightWord.length());
					i=0;
					break;
				}
			}
			
		}
		
		System.out.println(leftWord.length());
		System.out.println(rightWord.length());
		
		
	}
}
