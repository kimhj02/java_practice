package chap11;
//valueOf는 값을 문자열로 변환
//+연산은 concat과 valueOf를 합친 연산이다
//concat은 연속으로 사용 가능

public class overload_06 {
    public static void main(String[] args) {
        double e = 2.718;
        String st1 = "asdf".concat(String.valueOf(e));
        System.out.println(st1);
        String st2 = "김".concat("현").concat("진");
        System.out.println(st2);
        System.out.println();


        StringBuilder stbuf = new StringBuilder("123");
        stbuf.append(45678);

        System.out.println(stbuf.toString());

        stbuf.delete(0,2); // 문자열 일부 삭제
        System.out.println(stbuf.toString());

        stbuf.replace(0,3,"AB");    //문자열 일부 교체
        System.out.println(stbuf.toString());

        stbuf.reverse();    //문자열 내용 뒤집기
        System.out.println(stbuf.toString());

        String sub = stbuf.substring(2,4);
        System.out.println(sub);
    }
}
