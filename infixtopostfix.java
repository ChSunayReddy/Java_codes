import java.util.*;
public class infixtopostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String[] tokens = m.split(" ");
        Stack<String> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (String token : tokens) {
            if (isOperand(token)) {
                output.append(token).append(" ");
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    output.append(stack.pop()).append(" ");
                }
                stack.pop(); 
            } else if (isOperator(token)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    output.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }

        System.out.println(output.toString().trim());
    }

    static boolean isOperand(String token) {
        return !isOperator(token) && !token.equals("(") && !token.equals(")");
    }

    static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
    }

    static int precedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                return 0;
        }
    }
}
