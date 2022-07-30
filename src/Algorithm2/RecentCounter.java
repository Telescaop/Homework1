package Algorithm2;

import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {
    static final int RANGE = 3000;
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        while (!queue.isEmpty() && queue.peek() < t - RANGE) {
            queue.poll();
        } 
        queue.offer(t);
        return queue.size();
    }
}
