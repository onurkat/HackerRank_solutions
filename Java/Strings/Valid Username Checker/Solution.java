import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "[a-zA-Z][\\w]{7,29}$";
    // The pattern starts with [a-zA-Z] because usernames must only start with letters.
    // \\w means letters, digits and underscore.
    // And finally we limit it. (7,29) because char count must be lower than 30 and bigger than 8. 
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
