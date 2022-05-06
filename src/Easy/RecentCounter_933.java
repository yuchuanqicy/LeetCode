package Easy;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: yuchuanqi
 * @Date: 2022/05/06/21:48
 * @Description:
 */
public class RecentCounter_933 {
    Queue <Integer> queue;
    public RecentCounter_933() {
        queue=new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }
}
