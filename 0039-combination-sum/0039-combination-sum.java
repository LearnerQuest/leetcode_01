class Solution {

    public static void findCombination(int index,
                                       int target,
                                       int[] arr,
                                       List<List<Integer>> ans,
                                       List<Integer> ds) {

        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target) {
            ds.add(arr[index]);

            findCombination(index,
                            target - arr[index],
                            arr,
                            ans,
                            ds);

            ds.remove(ds.size() - 1);
        }

        findCombination(index + 1,
                        target,
                        arr,
                        ans,
                        ds);
    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        findCombination(0, target, arr, ans, ds);

        return ans;
    }
}