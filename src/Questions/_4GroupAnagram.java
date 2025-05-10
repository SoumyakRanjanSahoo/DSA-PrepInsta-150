package Questions;

import java.util.*;

public class _4GroupAnagram {
    public static void main(String[] args) {
     String strs[]= {"act","pots","tops","cat","stop","hat"};
        System.out.println( groupAnagram(strs));
    }
    public static List<List<String>> groupAnagram(String[]strs){
        Map<String,List<String> >res=new HashMap<>();
        for (String s:strs){
            char[]charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortedS=new String(charArray);
            res.putIfAbsent(sortedS,new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
