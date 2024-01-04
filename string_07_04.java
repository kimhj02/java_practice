package project_practice.chap02.chap07;

public class string_07_04 {
    public static void main(String[] args) {
        //문자열 선언과 동시에 참조변수로 참조한다.
        String str1 = "happy";
        String str2 = "birthday";
        System.out.println(str1 + " " + str2);
        
        // 메소드에 문자열을 전달하는 다양한 방법을 보여준다.
        printstring(str1);
        printstring(" ");
        printstring(str2);
        printstring("\n");
        printstring("end of program! \n");

    }

    //String 참조변수를 매개변수로 선언하여 문자열을 전달 받을 수 있다.
    public static void printstring(String str){
    System.out.print(str);
    }

}
