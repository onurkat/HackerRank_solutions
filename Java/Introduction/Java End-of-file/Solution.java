import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNumber=0;
        String line = scan.nextLine();
        while(line!=null) {
            lineNumber++;
            System.out.println(lineNumber+" "+line);
            if(!scan.hasNextLine()) {
                break;
             }
            else {
                line = scan.nextLine();
            }

        }
        scan.close();
    }
}
