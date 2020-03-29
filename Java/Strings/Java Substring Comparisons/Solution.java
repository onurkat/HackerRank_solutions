import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String temp=""; // creating a temporary string to compare.
        smallest=s; // to make the first temp string the smallest.
        for(int i=0;i<s.length();i++){ 
            if(!((i+k)>s.length())){
                temp = s.substring(i,i+k);  
            }
            if(temp.compareTo(largest)>0){
                largest=temp;
            }
            if(smallest.compareTo(temp)>0){
                smallest=temp;
            }   
        }
        return smallest + "\n" + largest;
    }

