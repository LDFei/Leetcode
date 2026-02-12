//https://leetcode.cn/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>());
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0;i < nums1.length;i++)
        {
            st1.add(nums1[i]);
        }
        for(int i = 0;i < nums2.length;i++)
        {
            st2.add(nums2[i]);
        }

        for(int i : st1)
        {
            if(!st2.contains(i))
            {
                list1.add(i);
            }
        }
        for(int i : st2)
        {
            if(!st1.contains(i))
            {
                list2.add(i);
            }
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}