package chap12;

import java.util.Scanner;

public class console_04 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("문자열 입력 : ");
        String str1 = sc1.nextLine();
        
        System.out.println("문자열 입력 : ");
        String str2 = sc1.nextLine();

        System.out.printf("입력된 문자열 1 : %s \n",str1);
        System.out.printf("입력된 문자열 2 : %s \n",str2);
    }
}
