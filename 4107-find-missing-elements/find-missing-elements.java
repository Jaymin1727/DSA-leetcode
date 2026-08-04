class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missingElements = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return missingElements;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
            if (num < min) min = num;
            if (num > max) max = num;
        }
        for (int i = min + 1; i < max; i++){
            if (!numSet.contains(i)) {
                missingElements.add(i);
            }
        }
        return missingElements;
    }
}