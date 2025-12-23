import java.util.*;

class Solution {
    public int maxTwoEvents(int[][] events) {
        int n = events.length;

        // 1. Sort events by start time
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        // 2. Create another array sorted by end time
        int[][] endSorted = events.clone();
        Arrays.sort(endSorted, (a, b) -> a[1] - b[1]);

        int maxValueSoFar = 0;  // best value of non-overlapping past events
        int answer = 0;
        int j = 0;             // pointer for endSorted

        // 3. Traverse events by start time
        for (int i = 0; i < n; i++) {
            int start = events[i][0];
            int value = events[i][2];

            // Move j to include all events that end before current start
            while (j < n && endSorted[j][1] < start) {
                maxValueSoFar = Math.max(maxValueSoFar, endSorted[j][2]);
                j++;
            }

            // Option 1: pair current event with best previous
            answer = Math.max(answer, maxValueSoFar + value);

            // Option 2: take only current event
            answer = Math.max(answer, value);
        }

        return answer;
    }
}
