package chap11;
//string 인스턴스는 immutable 인스턴스
//인스턴스 안에서의 값 변환 불가능

public class overload_04 
{
    public static void main(String[] args) 
    {
    String str1 = "simple string";
    String str2 = "simple string";

    String str3 = new String("simple string");
    String str4 = new String("simple string");

    if(str1 == str2)
    {
        System.out.println("동일 인스턴스");
    }
    else 
    {
        System.out.println("다른 인스턴스");
    }

    if(str3 == str4)
    {
        System.out.println("동일 인스턴스");
    }
    else 
    {
        System.out.println("다른 인스턴스");
    }
    }
}
