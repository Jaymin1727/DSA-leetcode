class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return GCD(nums[0],nums[nums.length-1]);
    }
    static int GCD(int a, int b){
        if(a==0||b==0){
            return Math.max(a,b);
        }

        int result=Math.min(a,b);

        while(result>0){
            if(a%result==0&& b%result==0){
                break;
            }
            result--;
        }
        return result;
    }
}