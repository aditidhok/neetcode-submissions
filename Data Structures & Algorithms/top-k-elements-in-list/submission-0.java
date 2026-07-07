class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp=new HashMap<>();
        int c=1;
        for(int i: nums){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer,Integer>> l=new ArrayList(mp.entrySet());
        
        Collections.sort(l, (a,b)->b.getValue()-a.getValue());
        int []ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=l.get(i).getKey();
        }
        return ans;

    }
}
