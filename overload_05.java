package chap11;
//concat은 두 문자열을 연결시키는 메소드이다
//substring은 index값부터 마지막까지의 문자열을 반환한다.
//equals은 같으면 true 다르면 false 반환 
//caompareTo  같으면 0 

public class overload_05 {
    public static void main(String[] args) {
        String st1 = "coffee";
        String st2 = "bread";

        String st3 = st1.concat(st2);
        System.out.println(st3);

        String st4 = "Fresh".concat(st3);
        System.out.println(st4);

        st1 = "abcdefg";
        st2 = st1.substring(2);
        System.out.println(st2);

        String st5 = st1.substring(2,4);
        System.out.println(st5);

        st1 = "Lexicographically";
        st2 = "lexicographically";
        int cmp;

        if(st1.equals(st2))
            System.out.println("두 문자열은 같다");
        else  
            System.out.println("두 문자열 다름");

        cmp = st1.compareTo(st2);

        if(cmp == 0)
            System.out.println("두 문자열 일치");
        else if(cmp < 0)
            System.out.println("사전의 앞에 위치하는 문자 : " + st1);
        else
            System.out.println("사전의 앞에 위치하는 문자 " + st2);

        if(st1.compareToIgnoreCase(st2) == 0)
            System.out.println("두 문자열은 같다");
        else
            System.out.println("두 문자열은 다르다");
    }
}
