import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    String part = "(([0-1]{0,1}[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))";
    // ([0-1]{0,1}[0-9]{1,2}) means 000-199 also covers 0-99 and 00-099
    // (2[0-4][0-9]) means 200-249
    // (25[0-5]) means 250-255
    // you can try online and find better regex pattern on regex101.com
    String pattern = String.format("%s\\.%s\\.%s\\.%s", part, part, part, part);
}
