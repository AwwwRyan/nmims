public class Bracket {
    Stack stack;

    public Bracket(int capacity) {
        this.stack = new Stack(capacity);
    }

    public boolean areBracketsMatched(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                stack.display(); 
            } 
            else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
                stack.display(); 
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
                stack.display(); 
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
                stack.display(); 
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Bracket bracketChecker = new Bracket(100); 
        String input = "(A + B))  * C";
        boolean result = bracketChecker.areBracketsMatched(input);
        System.out.println(result);
    }
}
