package chap12;

import java.util.Scanner;

public class console_04 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("���ڿ� �Է� : ");
        String str1 = sc1.nextLine();
        
        System.out.println("���ڿ� �Է� : ");
        String str2 = sc1.nextLine();

        System.out.printf("�Էµ� ���ڿ� 1 : %s \n",str1);
        System.out.printf("�Էµ� ���ڿ� 2 : %s \n",str2);
    }
}
