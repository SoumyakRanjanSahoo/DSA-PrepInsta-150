package Questions;

public class _1Array_Duplicate {

    public static void main(String[] args) {
        int []arr={1,2,3,3};
        System.out.println(dup(arr));

    }
    public  static boolean dup(int[]arr){

        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j])return true;
            }
        }
        return false;
    }
}
