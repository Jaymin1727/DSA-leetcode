import java.util.*;

class Solution {

    public long gcdSum(int[] nums) {

        int n = nums.length;
        int[] prefixGcd = new int[n];

        int mx = nums[0];

        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            prefixGcd[i] = gcd(nums[i], mx);
        }

        Arrays.sort(prefixGcd);

        long ans = 0;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            ans += gcd(prefixGcd[i], prefixGcd[j]);
            i++;
            j--;
        }

        return ans;
    }

    private int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}