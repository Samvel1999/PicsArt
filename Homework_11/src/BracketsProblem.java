import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsProblem {
    public static boolean check(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
            else if(str.charAt(i) == '}') {
                if(stack.isEmpty() || stack.peek() != '{') {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
            else if(str.charAt(i) == ']') {
                if(stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "sdnjdks{sjdkfsdkn}skdmf[sjkdnfn[sdnkjvnd]]}}ddfvn(njsdv{{}})";
        String str2 = "(((())){()})";

        System.out.println(check(str1));
        System.out.println(check(str2));
    }
}
