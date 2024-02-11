class Solution {
    public double myPow(double x, int n){//O(log n)
        if(n==0){
            return 1;
        }

        
        double halfPower = myPow(x, n/2);
        double halfPowerSq = 0;
        if(n<0){
            n = -n;
            x = 1 / x;
        }

        halfPowerSq = halfPower * halfPower;
        if(n%2!=0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
}

