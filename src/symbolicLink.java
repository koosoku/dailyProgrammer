public class symbolicLink {

	public static void main(String[] args){
		int paths = 4;
		//String[] input = {"/home/elite/documents:/media/mmcstick/docs","/home/elite/documents/office"};
		String[] input = {"/bin/thing:/bin/thing-3","/bin/thing-3:/bin/thing-3.2","/bin/thing-3.2/include:/usr/include","/usr/include/SDL:/usr/local/include/SDL","/bin/thing/include/SDL/stan"};
		System.out.println(links(paths,input));
	}
	public static String links(int paths, String[] linkConditions){
		String[][] links = new String[paths][2]; 
		for(int i = 0; i<paths; i++){
			links[i] = linkConditions[i].split(":");
		}
		for(int i = 0; i<paths;i++){
			linkConditions[paths] = linkConditions[paths].replace(links[i][0], links[i][1]);
		}
		
		return linkConditions[paths];
	}
}
