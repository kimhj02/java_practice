package chap11;
//문자열은 string class 인스턴스다

public class overload_03 
{
     public static void showString(String str)
    {
        System.out.println(str);
        System.out.println(str.length());
    }


    public static void main(String[] args) 
    {
        String str1 = new String("simple string");
        String str2 = "the best string";

        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println();   //개행

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("asd");
    }   
}

