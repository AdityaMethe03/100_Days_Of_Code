class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int arr[], int si, int ei) {        
        if(si>=ei){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2; //(si+ei)/2
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei);
    }

    public void merge(int arr[], int si, int mid, int ei){
        //left(0,2)=3 right(3,5)=3 
        int temp[] = new int[ei-si+1]; //ei=5 si=0
        int i = si; //iterator for left part
        int j = mid+1; //iterator for rigth part
        int k = 0; //iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                 temp[k] = arr[i];
                 i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //copy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
}

    
