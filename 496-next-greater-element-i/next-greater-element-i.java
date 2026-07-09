class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st=new Stack<>();
        int n=nums1.length;
        int[] nextGreter=new int[10001];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=nums2[i]){
                st.pop();
            }
            nextGreter[nums2[i]]=st.isEmpty()?-1:st.peek();
            st.push(nums2[i]);
        }
        for(int i=0;i<n;i++){
            nums1[i]=nextGreter[nums1[i]];
        }
        return nums1;
    }
}