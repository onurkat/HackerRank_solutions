import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String result = "Yes"; // default result.
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) != A.charAt(A.length()-1-i)){ // -1 because String.length() starts with 1.
                result = "No"; // if chars not eq
            }
        }
        System.out.println(result); // printing final result.
    }
}