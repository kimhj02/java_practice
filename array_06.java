package chap13;
//다차원 배열
public class array_06 {
    public static void main(String[] args) {
        int[][] arr2 = new int[3][4];

        int num = 1;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                arr2[i][j] = num;
                num++;
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        int arr[][] = {{11} , {22,33}, {33,44,55}};

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j <arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
