package project_practice.chap02.chap06;
//변수의 스코프
//괄호내에서 선언된 변수는 그 괄호에서만 활용 가능하다
public class method_06_03 {
    public static void main(String[] args) 
    {
        boolean ste = true;
        int num1 = 11;

        if(ste)
        {
            //int num1 = 22;
            num1++;
            System.out.println(num1);
        }

        {
            int num2 = 33;
            num2++;
            System.out.println(num2);
        }

        //System.out.println(num2);
    }
    
}
