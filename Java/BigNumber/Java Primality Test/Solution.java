import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        if(new BigInteger(n).isProbablePrime(1)) { // Returns true if this BigInteger is probably prime
            System.out.println("prime");          // the parameter is certanity
        }                                         // 1 checks for prime, 0 always false, negative always true
        else {
            System.out.println("not prime");
        }

        scanner.close();
    }
}
