class Solution {

    boolean contains(int nums[],int t){
        for(int n: nums){
            if(n==t)
            return true;
            
        }
         
         return false;
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int l=1;
        for(int i=0;i<nums.length;i++){
            int ans=1;
                int curr=nums[i];
                while(contains(nums,curr+1)){
                    curr++;
                    ans++;
                }
            l=Math.max(l,ans);
        }
        
        return l;
        
    }
}
