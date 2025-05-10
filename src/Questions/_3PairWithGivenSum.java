package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _3PairWithGivenSum {
    public static void main(String[] args) {
        int[]a={3,4,5,6};
        int[]b=new int[2];
        int target=7;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]+a[j]==target){
                   b[0]=i;
                   b[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
