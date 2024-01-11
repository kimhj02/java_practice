package chap20;
//오토 박싱과 토오 언방싱
//래퍼 클래스로 선언 후, 기본 자료형으로 접근하려고 하면 오토 박싱이 일어남
//기본 자료형으로 선언 후, 래퍼 클래스로 접근하려고 하면 오토 언박싱이 일어남

public class wrapper_03 {
    public static void main(String[] args) {
        Integer iobj = 10;  //오토 박싱
        Double dobj = 3.14; //오토 박싱
        System.out.println(iobj);
        System.out.println(dobj);
        System.out.println();

        int num1 = iobj;    //오토 언박싱
        double num2 = dobj; //오토 언박싱

        System.out.println(num1);
        System.out.println(num2);

        Integer num = 10;   //오토 박싱
        num++;  //오토 박싱, 오토 언박싱 동시 진행
        System.out.println(num);

        num += 3;   //오토 박싱, 오토 언박싱 동시 진행
        System.out.println(num);

        int r = num +5; //오토 언박싱 진행
        Integer robj = num - 5; //오토 언박싱 진행
        System.out.println(r);
        System.out.println(robj);

        
    }
}
