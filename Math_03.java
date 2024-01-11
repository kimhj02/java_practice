package chap20;

import java.util.Scanner;
import java.util.Random;

public class Math_03 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Random rand = new Random();
        for(int i = 0; i < 10; i++)
        {
            System.out.println(rand.nextInt(num1,num2));
        }

    }
    
}
