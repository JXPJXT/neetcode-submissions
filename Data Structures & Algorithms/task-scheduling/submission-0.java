class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for (char c : tasks) {
            counts[c - 'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int count : counts) {
            if (count > 0) {
                maxHeap.add(count);
            }
        }

        Deque<int[]> queue = new ArrayDeque<>();
        int time = 0;

        while (!maxHeap.isEmpty() || !queue.isEmpty()) {
            time++;

            if (!maxHeap.isEmpty()) {
                int remaining = maxHeap.poll() - 1;
                if (remaining > 0) {
                    queue.add(new int[]{remaining, time + n});
                }
            }

            if (!queue.isEmpty() && queue.peek()[1] == time) {
                maxHeap.add(queue.poll()[0]);
            }
        }

        return time;
    }
}