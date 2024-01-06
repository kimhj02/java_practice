package chap12;

import java.util.Scanner;

public class console_03 {
    public static void main(String[] args) {
        String source = "1 3 5";
        Scanner sc = new Scanner(source);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d\n",num1,num2,num3,sum);

        Scanner sc1 = new Scanner(System.in);
        num1 = sc1.nextInt();
        num2 = sc1.nextInt();
        num3 = sc1.nextInt();
        sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d\n",num1,num2,num3,sum);

        System.out.println("문자열 입력 : ");
        String str1 = sc1.nextLine();
        
        System.out.println("문자열 입력 : ");
        String str2 = sc1.nextLine();

        System.out.printf("입력된 문자열 1 : %s \n",str1);
        System.out.printf("입력된 문자열 2 : %s \n",str2);
    }
}