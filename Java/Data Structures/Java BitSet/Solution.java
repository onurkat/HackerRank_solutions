import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        for(int i=0;i<M;i++) {
            String op = scan.next();
            int left = scan.nextInt();
            int right = scan.nextInt();
            if(op.equals("AND")) {
                if(left == 1) {
                    B1.and(B2);
                } else {
                    B2.and(B1);
                }
            }
            else if(op.equals("OR")) {
                if(left == 1) {
                    B1.or(B2);
                } else {
                    B2.or(B1);
                }
            }
            else if(op.equals("XOR")) {
                if(left == 1) {
                    B1.xor(B2);
                } else {
                    B2.xor(B1);
                }
            }
            else if(op.equals("FLIP")) {
                if(left == 1) {
                    B1.flip(right);
                } else {
                    B2.flip(right);
                }
            }
            else if(op.equals("SET")) {
                if(left == 1) {
                    B1.set(right);
                } else {
                    B2.set(right);
                }
            }
        System.out.println(B1.cardinality() + " " + B2.cardinality());
        // cardinality() method returns the number of bits set to true in a BitSet
        }
    }
}
