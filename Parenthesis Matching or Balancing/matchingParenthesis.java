import  java.util.*;

public class parenthesisMatching {
	static Scanner input = new Scanner(System.in);
	
	public static int matchParenthesis(String paren){
		int index, countOP = 0 , countCP = 0;
		
		if(paren.length() == 0)
			return 0;
		else{
			if(paren.charAt(0) == ')'){
				return -1;
			}else{
				countOP++;
				for(index = 1 ; index < paren.length() ; index++){
					switch(paren.charAt(index)){
						case '(':	countOP++;
									break;
						
						case ')':	countCP++;
									break;
						
					}
				}
				
				if(countOP == countCP){
					return countOP;
				}else{
					return -1;
				}
			}
		}
		
	}

	public static void main (String[] args){
		String paren = input.nextLine();
		
		System.out.print(matchParenthesis(paren));
	}
}
