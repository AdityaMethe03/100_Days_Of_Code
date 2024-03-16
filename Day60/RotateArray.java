class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;// find reminder of k divided by nums.length because k is more than nums.length we don't need to iterate huge iterations.
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
