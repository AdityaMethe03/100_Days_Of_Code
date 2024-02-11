class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();

        while(left<right){
            int k = left + (right - left) / 2;
            if(check(piles, k, h) == true){
                right = k;
            }else{
                left = k+1;
            }
        }
        return right;
    }

    static boolean check(int[] piles, int mid, int h){
        int count=0;
            for(int i=0; i<piles.length; i++){
                if(piles[i]<=mid){
                    count++;
                }else if(piles[i]>mid){
                    if(piles[i]%mid==0){
                        count += piles[i]/mid;
                    }else{
                        count += (piles[i]/mid + 1);
                    }
                } 
            }

            if(count<=h){
                return true;
            }else{
                return false;
            }
    }
}
