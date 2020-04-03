import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Creating ArrayList of ArrayLists to store them.
        ArrayList<ArrayList<Integer>> arrLists = new ArrayList();
        int n=scan.nextInt();
        for(int rowCount=0;rowCount<n;rowCount++) {
            int cellCount = scan.nextInt();
            ArrayList<Integer> arrList = new ArrayList<Integer>();
            for(int j=0;j<cellCount;j++) {
                arrList.add(scan.nextInt());
            }
        arrLists.add(arrList);
        }
        int ans = scan.nextInt();
        for(int i=0;i<ans;i++) {
            int x=scan.nextInt();
            int y=scan.nextInt();
            ArrayList<Integer> tempList = arrLists.get(x-1);
            if(y<=tempList.size()) {
                System.out.println(tempList.get(y-1));
            }
            else {
                System.out.println("ERROR!");
            }
        }

    }
}
