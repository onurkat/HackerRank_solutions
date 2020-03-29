import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) { // quick check for length diff
            return false;
        }
        char[] arrA = a.toLowerCase().toCharArray(); // to make the array not case sensitive
        char[] arrB = b.toLowerCase().toCharArray();
        String aSorted = charArraySorter(arrA);
        String bSorted = charArraySorter(arrB);        
        if(aSorted.equals(bSorted)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String charArraySorter(char[] chars) { // java.util.Arrays is forbidden to use so I had to write an array sorter.
        int j = 0;
        char temp = 0;
        for (int i = 0; i < chars.length; i++) {
            for (j = 0; j < chars.length; j++) {
                if (chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return String.valueOf(chars);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}