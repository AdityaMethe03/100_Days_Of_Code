class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combSum(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }

    public void combSum(int[] candidates, int target,List<List<Integer>> res, List<Integer> curr, int start) {
        if(target==0) {
            res.add(new ArrayList<>(curr));
        } else if(target<0) {
            return;
        }

        for(int i=start; i<candidates.length; i++) {
            curr.add(candidates[i]);
            combSum(candidates, target-candidates[i], res, curr, i);
            curr.remove(curr.size()-1);
        }
    }
}