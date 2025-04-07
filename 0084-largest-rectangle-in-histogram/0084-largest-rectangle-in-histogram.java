class Solution {
    public int largestRectangleArea(int[] arr) {
        int index = 0;
        int maxArea = 0;  
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        
        while(index < n){
            if(stack.isEmpty() || arr[stack.peek()] <= arr[index]){
                stack.push(index);
                index++;
            } else {
                int topindex = stack.pop();
                int height = arr[topindex];
                int width = stack.isEmpty() ? index : index - stack.peek() - 1;
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        
        while(!stack.isEmpty()) {
            int topindex = stack.pop();
            int height = arr[topindex];
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            int area = height * width;
           
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
}