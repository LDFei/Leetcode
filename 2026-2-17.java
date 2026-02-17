//https://leetcode.cn/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75


class RecentCounter {
    private Deque<Integer> queue = new LinkedList<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        while(!queue.isEmpty() && queue.peekFirst()<t-3000)
            queue.pollFirst();
        queue.offer(t);
        return queue.size();
    }
}