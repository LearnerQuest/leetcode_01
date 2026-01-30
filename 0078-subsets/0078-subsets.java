class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new  ArrayList<>();
        backtrack(arr, 0,new  ArrayList<>() ,result);
        return result;
    }
    static void backtrack(int[] arr, int i, ArrayList<Integer> temp,List<List<Integer>> result){
        if(i== arr.length){
            result.add(new ArrayList<>(temp)); 
            return;
        }
        
        backtrack(arr, i+1, temp,result);
        temp.add(arr[i]);
        backtrack(arr, i+1, temp,result);
        temp.remove(temp.size()-1);
    }
};
