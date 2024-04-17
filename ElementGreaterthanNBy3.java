/*229. Majority Element II
Solved
Medium
Topics
Companies
Hint
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 

Follow up: Could you solve the problem in linear time and in O(1) space?*/
class ElementGreaterthanNBy3 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int k = n/3;
        for(int key:hm.keySet()){
           if(hm.get(key)>k){
            al.add(key);
           }
        }
        return al;
    }
}
