package chap13;

public class array_03 {

    static int sumofary(int[] ar)
    {
        int sum = 0;
        for(int i = 0; i < ar.length; i++)
        {
            sum += ar[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum = sumofary(arr);
        System.out.println(sum);
    }
}
