import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            list.add(scan.nextInt());
        }
        int q = scan.nextInt();

        for(int i=0;i<q;i++) {
            scan.nextLine();
            String qStr = scan.nextLine();
            if(qStr.equals("Insert")) {
                int qIndex = scan.nextInt();
                int qValue = scan.nextInt();
                list.add(qIndex,qValue);
            }
            if(qStr.equals("Delete")) {
                int dIndex = scan.nextInt();
                list.remove(dIndex);
            }
        }
        for(int i=0;i<list.size();i++) { // dont forget to loop with new size
            System.out.print(list.get(i)+" ");
        }
    }
}
