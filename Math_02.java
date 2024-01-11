package chap20;
//난수 생성
//next+자료형으로 사용할 수 있다.(ex) nextInt(1000)은 1이상 1000이하 난수를 반환한다.)

import java.util.Random;

public class Math_02 {
    public static void main(String[] args) {
        Random rand = new Random(12);//seed를 지정하면 동일한 수의 난수가 나온다.
    
        for(int i = 0; i < 7; i++)
        {
            System.out.println(rand.nextInt(1000));
        }


        Random real_rand = new Random(System.currentTimeMillis());  //현재 날짜와 시간에 따라 달라지므로 같은 값이 나오지 않는다.

        for(int i= 0; i < 7; i++)
        {
            System.out.println(real_rand.nextInt(1000));  
        }
    }
}
