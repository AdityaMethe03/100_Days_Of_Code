class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrack(res, new StringBuilder(), n, 0, 0);
        return res;
    }

    public void backTrack(List<String> res, StringBuilder curr, int n, int open, int close) {
        if (open == close && close == n) {
            res.add(curr.toString());
            return;
        }

        if (open < n) {
            curr.append("(");
            backTrack(res, curr, n, open+1, close);
            curr.deleteCharAt(curr.length() - 1);
        }

        if(close < open) {
            curr.append(")");
            backTrack(res, curr, n, open, close+1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}