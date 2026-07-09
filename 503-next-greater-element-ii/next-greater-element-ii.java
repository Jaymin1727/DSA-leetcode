class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>(); 
        int ans[] = new int[n]; 
        
        // Loop twice the length to simulate a circular array
        for (int i = 2 * n - 1; i >= 0; i--) { 
            // Pop smaller or equal elements out of the monotonic stack
            while (!st.isEmpty() && st.peek() <= nums[i % n]) { 
                st.pop(); 
            } 
            
            // Populate the answer only for the actual array bounds
            if (i < n) {
                if (!st.isEmpty()) { 
                    ans[i] = st.peek(); // Fixed st.top() to st.peek()
                } else { 
                    ans[i] = -1; 
                } 
            }
            
            // Push the current element into the stack
            st.push(nums[i % n]); 
        } 
        return ans;
    }
}