class Solution {
    public void sortColors(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int k=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[k] = i;
                k++;
                count[i]--;
            }
        }
    }
}
