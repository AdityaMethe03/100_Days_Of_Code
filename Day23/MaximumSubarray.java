class Solution {
    public int maxSubArray(int[] numbers) {
        int ms = Integer.MIN_VALUE; //Max Sum
        int cs = 0;//Current Sum

        boolean isNumNeg = true;
        //This all Negative element in array condition is not in KADANE'S algo
        //We have to write it on our own
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>0){
                isNumNeg = false;
                break;
            }
        }

        if(isNumNeg==true){
            Arrays.sort(numbers);
            return  numbers[numbers.length-1];
        }else{
            for(int i=0; i<numbers.length; i++){
                cs = cs + numbers[i];
                if(cs<0){
                    cs=0;
                }
                ms = Math.max(cs, ms);
            }
        }
        return ms;
    }
}
