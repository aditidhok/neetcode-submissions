class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int [] op=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                 p=p*nums[j];
                }    
            }
            op[i]=p;
            p=1;
        }
        return op;
    }
}  
