class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(ans, new ArrayList<>(), n, k, 1);
        return ans;
    }

    public void comb( List<List<Integer>> ans, List<Integer> curr, int n,  int k, int start) {

        if(curr.size()==k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=start; i<=n; i++) {
            curr.add(i);
            comb(ans, curr, n, k, i+1);
            curr.remove(curr.size() - 1);
        }
    }
}
