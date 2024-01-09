package chap18;
//ArrayIndexOutOfBoundsException 배열의 범위를 벗어남
public class excepiton_04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(int i = 0; i < 4; i++)
        {
            System.out.println(arr);
        }
    }
}
