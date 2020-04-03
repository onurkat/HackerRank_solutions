import java.util.*;

public class Solution {

    public static boolean move(int leap, int[] game, int i) {
        if ((i < 0) || (game[i] == 1)) {
            return false;
        }
        if ((i == game.length - 1) || (i + leap > game.length - 1)) {
            return true;
        }
        game[i] = 1; // to avoid endless loops we flag where we visit
        return move(leap, game, i-1)
        || move(leap, game, i+1)
        || move(leap, game, i + leap);
        // have to check every move recursively
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean result = move(leap,game,0); // start from 0
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
