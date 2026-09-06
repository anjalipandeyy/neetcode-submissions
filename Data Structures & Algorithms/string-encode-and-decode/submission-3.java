class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty()){ return "";}
        String oneString = strs.stream().map(a->a+"1").reduce((a,b) -> a.concat("1-1"+b)).get();
        System.out.println(oneString);
        return oneString;
    }

    public List<String> decode(String str) {
        if(str==""){
            return new ArrayList();
        }
        List<String> stringList = List.of(str.split("1-1")).stream().map(a -> a.substring(0,a.length()-1)).collect(Collectors.toList());
        return stringList;
    }
}
