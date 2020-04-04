import java.util.*;
class Solution{

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
            Stack<Character> stack = new Stack<Character>();
            String result = "true";
            for(int i=0;i<input.length();i++) {
                Character ch = input.charAt(i);

                if(ch=='{') { stack.push('{'); }
                if(ch=='[') { stack.push('['); }
                if(ch=='(') { stack.push('('); }
                if(ch=='}') {
                    if(!stack.empty()) {
                        if(stack.peek()=='{') { stack.pop(); }
                    }
                    else {
                        result = "false";
                    }
                }
                if(ch==']') {
                    if(!stack.empty()) {
                        if(stack.peek()=='[') { stack.pop(); }
                    }
                    else {
                        result = "false";
                    }
                }
                if(ch==')') {
                    if(!stack.empty()) {
                        if(stack.peek()=='(') { stack.pop(); }
                    }
                    else {
                        result = "false";
                    }
                }
            }
            if(stack.empty() && result=="true") { // stack is empty and no close parenthesis left
            System.out.println("true");
            }
            else {
                System.out.println("false");
            }
		}
	}
}
