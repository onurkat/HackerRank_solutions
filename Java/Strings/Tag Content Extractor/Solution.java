import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			//Write your code here
            // We should find the start tag first.
            // The content between the tags can contain any char but '<'
            // End finally we will seek the name of the start tag for the end tag with a '/' before it.
            Pattern patt = Pattern.compile("<(.+)>([^<]+)</\\1>");
            // <(.+)> means it start tag should be like <ANYTHING BUT NOT EMPTY> the tag name must not be empty.
            // ([^<]+) means the content is anything except '<'
            // </\\1> means we seek for the same match (the name of the same tag) again so we backrefence it.
            Matcher match = patt.matcher(line);
            boolean matchFound = false;
            while(match.find()) {
                System.out.println(match.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
			testCases--;
		}
	}
}
