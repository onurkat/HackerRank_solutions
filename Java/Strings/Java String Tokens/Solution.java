import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
        if (s.trim().isEmpty()) { // quick check if string empty
            System.out.println(0);
        }
            else {
                String[] sSplitted = (s.trim().split("[.@?!_,'\\s]+"));
                 // first, trimming the space at the start and the end of the given string.
                 // then splitting the string by the given chars and space.
                System.out.println(sSplitted.length);
                    for(String piece : sSplitted) {
                        System.out.println(piece);
                    }
            }
    }
}
