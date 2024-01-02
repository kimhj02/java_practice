package project_practice.chap02.chap04;

public class operator_04_03 {
    public static void main(String[] args) 
    {
        //비트 연산자
        //& 비트 단위로 AND 연산을 한다
        // | 비트 단위로 OR 연산을 한다
        // ^ 비트 단위로 XOR 연산을 한다
        // ~ 피연산자의 모든 비트를 반전시켜서 얻은 결과를 반환
        byte n1 = 13;
        byte n2 = 7;
        byte n3 =(byte)(n1 & n2);
        System.out.println(n3); //5
        //0 0 0 0 1 1 0 1
        //0 0 0 0 0 1 1 1
        //0 0 0 0 0 1 0 1 = 5;
        byte n4 = (byte)(n1 | n2);
        System.out.println(n4); //15
        //0 0 0 0 1 1 0 1
        //0 0 0 0 0 1 1 1
        //0 0 0 0 1 1 1 1 = 15;
        byte n5 = (byte)(n1 ^ n2); 
        System.out.println(n5); //10
        //0 0 0 0 1 1 0 1
        //0 0 0 0 0 1 1 1
        //0 0 0 0 1 0 1 0 = 10;
        System.out.println(n1); //13
        //0 0 0 0 1 1 0 1
        //1 1 1 1 0 0 1 0 = 13

        //비트 쉬프트
        byte num;

        num = 2;

        System.out.println((byte)(num << 1) + " ");//00000100
        System.out.println((byte)(num << 2) + " ");//00001000
        System.out.println((byte)(num << 3) + " ");//00010000
        
        num = 8;
        System.out.println((byte)(num >> 1) + " ");//00000100
        System.out.println((byte)(num >> 2) + " ");//00000010
        System.out.println((byte)(num >> 3) + " ");//00000001

        num = -8; //11111000
        System.out.println((byte)(num >> 1) + " ");//11111000
        System.out.println((byte)(num >> 2) + " ");//11111100
        System.out.println((byte)(num >> 3) + " ");//11111110






    }
}
