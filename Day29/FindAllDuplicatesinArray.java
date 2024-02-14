class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr1 = new ArrayList<Integer>();

        int largest = Arrays.stream(nums).max().getAsInt();
        int count[] = new int[largest+1];
        
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        
        int k=0;
        for(int i = 0; i<count.length; i++){
            if(count[i]>1){
                arr1.add(i);
                k++;
            }
        }
        return arr1;
    }
}
