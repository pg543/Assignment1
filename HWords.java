
public class HWords {
	
	public static void main(String[] args) {
		String s= "hi good morning, how are you, We are here to celibrate holi, plz come home";    
		String[] words = s.split("\\s");
		        
		for (String word : words) {
		    if (word.startsWith("h") || word.startsWith("H")) {
		        System.out.println(word);
		    }
		}
	}	
}