class Solution {
    public int search(int[] nums, int target) {
        int tarIdx = searchTar(nums, target, 0, nums.length-1);
        return tarIdx;
    }

    public int searchTar(int arr[], int tar, int si, int ei){
        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei-si)/2; //(si+ei)/2

        //case Found
        if(arr[mid] == tar){
            return mid;
        }

        //mid one L1
        if(arr[si] <= arr[mid]){
            //case a : left 
            if(arr[si] <= tar && tar <= arr[mid]){
                return searchTar(arr, tar, si, mid);
            }else{
                //case b : right
                return searchTar(arr, tar, mid+1, ei);
            }
        }

        //mid on L2
        else{
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return searchTar(arr, tar, mid+1, ei);
            }else{
                //case d : left
                return searchTar(arr, tar, si, mid-1);
            }
        }
    }
}
