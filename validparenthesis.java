import java.util.*;

class validparenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String[] a = m.split("");
        Stack<String> s = new Stack<>();

        for (String i : a) {
            if (i.equals("{") || i.equals("[") || i.equals("(")) {
                s.push(i);
            } else if (i.equals("}") || i.equals("]") || i.equals(")")) {
                 if (!s.isEmpty() && isMatchingPair(s.peek(), i)) {
                    s.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(s.isEmpty());
    }
    private static boolean isMatchingPair(String opening, String closing) {
        return (opening.equals("{") && closing.equals("}")) ||
               (opening.equals("[") && closing.equals("]")) ||
               (opening.equals("(") && closing.equals(")"));
    }
}