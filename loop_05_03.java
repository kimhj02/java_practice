package project_practice.chap02.chap05;

public class loop_05_03 {
    public static void main(String[] args) 
    {
        //whlie ¹®
        int num = 0;

        while(num < 5)
        {
            System.out.println(num);
            num++;
        }

        int num1 = 0;
        do{
            System.out.println("i like java " + num1);
            num1++;
        }while(num1 < 5);

        int a = 1;
        int total = 0;

        while(a <= 100)
        {
            total += a;
            a++;
        }
        System.out.println(total);

        //for ¹®
        int c = 5;
        for(int i = 0; i <= c; i++)
        {
            System.out.println(i);
        }
        int num2 = 1;
        for(int i = 1; i <= 10; i++)
        {
            num2 *=i;
        }
        System.out.println(num2);
        
    }
}
