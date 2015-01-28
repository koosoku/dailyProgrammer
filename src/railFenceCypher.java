public class railFenceCypher {
	public static void main(String[] args){
		String input = "1234567891234";
		encode(3,input);
	}
	public static String encode(int rows, String message){
		String[] rowCode = new String[rows];
		for(int i = 0; i<rows; i++){
			rowCode[i] = "";
		}
		
		for(int i = 0; i<message.length(); i+=(rows-1)*2){
			rowCode[0] += message.charAt(i);
			for(int j=1; j<rows-1; j++){
				if(i+j< message.length())
					rowCode[j] += message.charAt(i+j);
				if(i+j+(rows-2)*2< message.length())
					rowCode[j] +=message.charAt(i+j+(rows-2)*2);  
			}
			if(i+rows<message.length())
				rowCode[rows-1] +=message.charAt(i+rows-1);
		}
		
		for(int i = 0; i<rows; i++){
			System.out.println(i+ "row: "+ rowCode[i]);
		}
		
		
		return "";
		
	}
}
