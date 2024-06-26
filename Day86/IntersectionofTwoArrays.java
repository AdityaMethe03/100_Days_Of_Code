class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intSec = new HashSet<>();

        for(int i=0; i<nums1.length; i++) {
            set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++) {
            if(set.contains(nums2[i])) {
                intSec.add(nums2[i]);
            }
        }

        int res[] = new int[intSec.size()];
        int i=0;
        for(int a: intSec) {
            res[i] = a;
            i++;
        }

        return res;
    }
}
