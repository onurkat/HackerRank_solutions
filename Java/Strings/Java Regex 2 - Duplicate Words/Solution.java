import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "(\\b\\w+\\b)(\\s*\\1\\b)+";
        // (\\b\\w+\\b) is any word
        // (\\s*\\1\\b)+ is the words all repetitions
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // not case sensitive
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
                // m.group() returns all of the matching repetitions, m.group(1) returns only the first one.
            }
            // Prints the modified sentence.
            System.out.println(input);
        }
        in.close();
    }
}
