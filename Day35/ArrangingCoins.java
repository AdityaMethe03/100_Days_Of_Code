class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n, mid = 0;
		while(left <= right){	
			mid = (left + right) / 2;
			long coins = (mid * (mid + 1)) / 2;
            if(coins == n) return (int)mid;
			else if(coins > n) right = mid - 1;
			else left = mid + 1;
		}
		return (int) right;
    }
}
