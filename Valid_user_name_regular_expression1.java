import java.util.Scanner;
class Valid_user_name_regular_expression {
    /*
     * Write regular expression here.
     */
     
    public static final String regularExpression = "[A-Za-z]\\w{7,29}";
}


public class Valid_user_name_regular_expression1 {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(Valid_user_name_regular_expression.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
