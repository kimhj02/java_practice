package chap20;
//���� ����
//next+�ڷ������� ����� �� �ִ�.(ex) nextInt(1000)�� 1�̻� 1000���� ������ ��ȯ�Ѵ�.)

import java.util.Random;

public class Math_02 {
    public static void main(String[] args) {
        Random rand = new Random(12);//seed�� �����ϸ� ������ ���� ������ ���´�.
    
        for(int i = 0; i < 7; i++)
        {
            System.out.println(rand.nextInt(1000));
        }


        Random real_rand = new Random(System.currentTimeMillis());  //���� ��¥�� �ð��� ���� �޶����Ƿ� ���� ���� ������ �ʴ´�.

        for(int i= 0; i < 7; i++)
        {
            System.out.println(real_rand.nextInt(1000));  
        }
    }
}
