import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String sumString = (new BigInteger(a).add(new BigInteger(b))).toString();
        String multiString = (new BigInteger(a).multiply(new BigInteger(b))).toString();
        // output
        System.out.println(sumString+"\n"+multiString);
    }
}
