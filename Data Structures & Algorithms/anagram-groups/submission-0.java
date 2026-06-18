class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> li=new ArrayList<>();
        for(String i:strs)
        {
            char[] ch=i.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(!map.containsKey(str)) map.put(str,new ArrayList<>());
            map.get(str).add(i);
        }
        for(List<String> i:map.values())
        {
          li.add(i);
        }
        return li;
    }
}
