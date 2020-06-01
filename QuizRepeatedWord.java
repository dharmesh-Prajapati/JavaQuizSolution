package Quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizRepeatedWord {

	// a string does not contain repeated character
	static List<String> alternatingCharacters(String s) {
		List<String> repeatedString = new ArrayList<String>();
		
		char charArr [] = s.toCharArray();
		
		for(int i = 0; i< charArr.length;i++) {
			repeatedString.add(Character.toString(charArr[i]));
			
		}
		String str ="";
		List<String> notRepeatedString = new ArrayList<String>();
		
		for(int i = 0; i< repeatedString.size();i++) {
			if(str.contains(repeatedString.get(i))) {
				notRepeatedString.add(str);
				str=repeatedString.get(i);
			}else {
				str+=repeatedString.get(i);
			}
		}
		notRepeatedString.add(str);
		return notRepeatedString;
	}
	
	public static void main(String[] args) {
		List<String> repeatering = alternatingCharacters("asdsasedsawerefdfgdfdfd");
		for(String str : repeatering) {
			System.out.println(str);
		}
	}

/* output:
asd
sa
sed
sawer
efd
fgd
fd
fd

*/

}