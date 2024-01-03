package project_practice.chap02.chap05;

public class loop_05_04 
{
    public static void main(String[] args) 
    {
        //break & continue
        int num = 1;
        boolean search = false;

        while(num < 100)
        {
            if((num % 5 == 0) && (num % 7 == 0))
            {
                search = true;
                break;
            }
            num++;
        }
        if(search)
            System.out.println("찾는 정수 : " + num);
        else    
            System.out.println("5의 배수이자 7의 배수인 숫자 없음");

        int num1 = 0;
        int count = 0;

        while((num1++) < 100)
        {
            if(((num1 % 5) != 0) || ((num1 % 7) != 0))
            {
                continue;
            }
            count++;
            System.out.println(num1);
        }
        System.out.println(count);

        int num2 = 1;
        while(true)
        {
            if(((num2 % 6) == 0) && ((num2 % 14) == 0))
            {
                break;
            }   
            num2++;
        }
        System.out.println(num2);
    }
}
