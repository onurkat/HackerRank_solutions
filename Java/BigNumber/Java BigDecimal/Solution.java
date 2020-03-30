import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        String temp="";
        for(int i=0;i<n-1;i++) {
            for(int j=1+i;j<n;j++) {
                if(new BigDecimal(s[i]).compareTo(new BigDecimal(s[j])) < 0) { // true if BigDecimal(s[j] is bigger
                    temp = s[i]; //bubble sort
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}

// Note: I couldn't code it perfectly it fails one of sample tests. It doesn't compare 0.12 and .12 properly.
