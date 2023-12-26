import java.util.Scanner;
import java.util.Stack;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String s;
		
		while(true) {		
			s = in.nextLine();
			
			if(s.equals(".")) {	
				break;
			}		
			System.out.println(solve(s));
		}
	
	}
	
	public static String solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);	
			
		
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			
			// 닫는 소괄호 일 경우 
			else if(c == ')') {
				
	
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
			else if(c == ']') {
				

				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}

		}
		
		if(stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}
 
}