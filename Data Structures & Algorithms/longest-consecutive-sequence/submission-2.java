class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        for(int n: nums){
            s.add(n);
        }
        int l=1;
        for(int i=0;i<nums.length;i++){
            int c=1;
            int curr=nums[i];
            if(!s.contains(nums[i]-1)){
                while(s.contains(curr+1)){
                    curr++;
                    c++;
                }
                
            }
            l=Math.max(c,l);
        }
        return l;

        
    }
}
