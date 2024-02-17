class Solution {
    //First occurance of element  
    int firstOccurance(int[] nums, int n ,int x){
        int left = 0 ,right = n-1;
        int first = -1;

        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid] == x){
                first = mid;
                right = mid - 1;
            }else if(nums[mid] < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return first;
    }

    //last occurance of element
    int lastOccurance(int[] nums,int n ,int x){
        int left = 0 ,right = n-1;
        int last = -1;

        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid] == x){
                last = mid;
                left = mid + 1;
            }else if(nums[mid] < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return last;

    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length; 
        int first = firstOccurance(nums,n,target);

        if(first == -1) return new int[] {-1,-1};
        
        int last = lastOccurance(nums,n,target);

        return new int[] {first , last};
    }
}
