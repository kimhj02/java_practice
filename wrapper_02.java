package chap20;
//박싱과 언박싱 개념
//기본 자료형을 박싱하면 인스턴스로 바뀐다.
//인스턴스를 언박싱하면 기본 자료형으로 바뀐다.

public class wrapper_02 {
    public static void main(String[] args) {
        Integer iobj = new Integer(10); //박싱
        Double dobj = new Double(3.14); //박싱
        System.out.println(iobj);
        System.out.println(dobj);
        System.out.println();

        int num1 = iobj.intValue();     //언박싱 
        double num2 = dobj.doubleValue();   //언박싱
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        //래퍼 인스턴스 값의 증가 방법

        iobj = new Integer(iobj.intValue() + 10);
        dobj = new Double(dobj.doubleValue() + 1.2);
        System.out.println(iobj);
        System.out.println(dobj);

    }
}
