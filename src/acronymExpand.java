public class acronymExpand {
	public static void main(String[] args){
		System.out.print(replace("wtf that was unfair"));
	}
	
	public static String replace(String input){
		String output = input;
		String[][] acronyms = {{"lol","dw","hf","gg","brb","g2g","wtf","wp","gl","imo"},
				{"laugh out loud","don't worry","have fun","good game","be right back","got to go","what the fuck","well played","good luck","in my opinion"}};  
		for(int i = 0; i<acronyms[0].length;i++){
			output = output.replace(acronyms[0][i], acronyms[1][i]);
		}
		return output;
	}
}
