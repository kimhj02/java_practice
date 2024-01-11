package chap20;
//문자열을 특정 구분자를 제외하고 구할 수 있다

import java.util.StringTokenizer;

public class Token_01 {
    public static void main(String[] args) 
    {
        StringTokenizer st1 = new StringTokenizer("pm:08:45",":");
        
        while(st1.hasMoreTokens())
            System.out.print(st1.nextToken() + ' ');
        System.out.println();

        StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/=");
        while(st2.hasMoreTokens())
            System.out.print(st2.nextToken()+' ');
        System.out.println();
    }
}
