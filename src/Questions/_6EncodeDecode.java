package Questions;

import java.util.ArrayList;
import java.util.List;

public class _6EncodeDecode {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        String encoded = encode(list);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
    public static String encode(List <String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }
    public static List decode(String str){
        List res=new ArrayList<>();
        int i=0;
        while (i<str.length()){
            int j=i;
            while (str.charAt(j)!='#')j++;
            int length=Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+length;
            res.add(str.substring(i,j));
            i=j;
        }
        return res;

    }
}
