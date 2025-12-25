class Solution {
    public int[] findEvenNumbers(int[] digits) {

        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;   // no leading zero

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                for (int k = 0; k < n; k++) {
                    if (i == k || j == k) continue;

                    if (digits[k] % 2 == 0) {   // even number
                        int num = digits[i] * 100
                                + digits[j] * 10
                                + digits[k];
                        set.add(num);
                    }
                }
            }
        }

        // convert to sorted array
        int[] result = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            result[idx++] = num;
        }

        Arrays.sort(result);
        return result;
    }
}
