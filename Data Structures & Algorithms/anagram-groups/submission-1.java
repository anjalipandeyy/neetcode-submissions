class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> answer = new HashMap();
        List<String> stringList = new ArrayList(Arrays.asList(strs));
        for(int i =0;i<strs.length;i++){
            var ac = strs[i].toCharArray();
            Arrays.sort(ac);
            var key = new String(ac);
            if(!answer.containsKey(key)){
               answer.put(key,new ArrayList()) ;
            }
            answer.get(key).add(strs[i]);
        }
        return new ArrayList(answer.values());
    }

    
}
