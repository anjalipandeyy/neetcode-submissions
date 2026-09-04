class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countKey = new HashMap();
        Arrays.stream(nums).boxed().forEach(
            num -> {
                if(!countKey.containsKey(num)){
                    countKey.put(num,0);
                }
                countKey.put(num,countKey.get(num)+1);}
                );
        List<Integer> list = countKey.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).map(entry -> entry.getKey()).collect(Collectors.toList());
        return list.subList(0,k).stream().mapToInt(Integer::intValue).toArray();
        
        
    }
}
