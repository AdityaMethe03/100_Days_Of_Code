class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        generateSubsets(nums, result, subset, 0);
        return result;
    }

    private void generateSubsets(int[] nums, List<List<Integer>> result, List<Integer> subset, int index) {
        // Base case: if index reaches the length of nums
        if (index == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // Include current element
        subset.add(nums[index]);
        generateSubsets(nums, result, subset, index + 1);

        // Exclude current element
        subset.remove(subset.size() - 1);
        generateSubsets(nums, result, subset, index + 1);
    }
}
