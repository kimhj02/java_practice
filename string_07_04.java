package project_practice.chap02.chap07;

public class string_07_04 {
    public static void main(String[] args) {
        //���ڿ� ����� ���ÿ� ���������� �����Ѵ�.
        String str1 = "happy";
        String str2 = "birthday";
        System.out.println(str1 + " " + str2);
        
        // �޼ҵ忡 ���ڿ��� �����ϴ� �پ��� ����� �����ش�.
        printstring(str1);
        printstring(" ");
        printstring(str2);
        printstring("\n");
        printstring("end of program! \n");

    }

    //String ���������� �Ű������� �����Ͽ� ���ڿ��� ���� ���� �� �ִ�.
    public static void printstring(String str){
    System.out.print(str);
    }

}
