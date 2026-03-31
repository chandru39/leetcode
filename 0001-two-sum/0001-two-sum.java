class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>umap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(umap.containsKey(compliment)){
                return new int[]{umap.get(compliment),i};
            }else{
                umap.put(nums[i],i);
            }
        }throw new IllegalArgumentException("No match");
    }
}