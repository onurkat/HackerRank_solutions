import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int result = a / b;
            System.out.println(result);
        }
        catch(InputMismatchException e) {
            System.out.println(e.getClass().toString().substring(6));
            // it prints "class java.util.InputMismatchException" and we have to get rid of "class"
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
