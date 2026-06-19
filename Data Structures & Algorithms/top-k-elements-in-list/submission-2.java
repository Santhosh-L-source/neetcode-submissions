class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
       Map<Integer,Integer> map=new HashMap<>();
       for(int i:nums)
       {
          map.put(i,map.getOrDefault(i,0)+1);
       } 
       ArrayList<Integer> li=new ArrayList<>(map.keySet());   
       Collections.sort(li,(a,b)->map.get(b)-map.get(a));
       int[] arr=new int[k];
       int n=0;
       for(int i=0;i<k;i++)
       {
          arr[n++]=li.get(i);
       }
       return arr;
    }
}
