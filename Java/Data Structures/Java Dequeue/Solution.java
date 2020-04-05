import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size() == m) { // deque's size will maintain the subarray size
                if(set.size() > max) { // hashset only contains unique elements so we will check it with hashset's size
                    max = set.size();
                }
                int first = (Integer) deque.removeFirst(); // we remove the first element and continue checking
                if(!deque.contains(first)) { // also remove it from the set if it is not in the dequeue at all
                    set.remove(first);
                }
            }
        }
        System.out.print(max); // output
    }
}
