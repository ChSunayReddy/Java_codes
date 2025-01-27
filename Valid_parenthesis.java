import java.util.*;

class Valid_parenthesis{

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code
            char[] ob = {'{', '(', '['};
            char[] cb = {'}', ')', ']'};
            int m = countOccurrences(input, ob[0]);
            int n = countOccurrences(input, ob[1]);
            int o = countOccurrences(input, ob[2]);
            int p = countOccurrences(input, cb[0]);
            int q = countOccurrences(input, cb[1]);
            int r = countOccurrences(input, cb[2]);
            if (m == p && n == q && o == r) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        sc.close();
    }
    public static int countOccurrences(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

