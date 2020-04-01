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
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();
        int highest=-50; // it can be between [-49,49]
        int temp=0;
        for(int i=1;i<5;i++) {
            for(int j=1;j<5;j++) {
                temp = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+ // upper part of the hourglass
                arr[i][j]+ // middle part of the hourglass
                arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1]; // bottom part of the hourglass
                if(temp>highest) {
                    highest = temp;
                }
            }
        }
        System.out.println(highest);
    }
}
