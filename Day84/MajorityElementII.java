class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majEle = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        //2nd Method
        // for(int i=0; i<nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }

        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet) {
            if(map.get(key) > nums.length/3) {
                majEle.add(key);
            }
        }

        return majEle;
    }
}
