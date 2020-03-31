import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {
        int a,b,n;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int result=a;
            for(int k=0;k<n;k++) {
                result += (Math.pow(2,k) * b);
                System.out.print(result+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
