package chap11;
//concat�� �� ���ڿ��� �����Ű�� �޼ҵ��̴�
//substring�� index������ ������������ ���ڿ��� ��ȯ�Ѵ�.
//equals�� ������ true �ٸ��� false ��ȯ 
//caompareTo  ������ 0 

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
            System.out.println("�� ���ڿ��� ����");
        else  
            System.out.println("�� ���ڿ� �ٸ�");

        cmp = st1.compareTo(st2);

        if(cmp == 0)
            System.out.println("�� ���ڿ� ��ġ");
        else if(cmp < 0)
            System.out.println("������ �տ� ��ġ�ϴ� ���� : " + st1);
        else
            System.out.println("������ �տ� ��ġ�ϴ� ���� " + st2);

        if(st1.compareToIgnoreCase(st2) == 0)
            System.out.println("�� ���ڿ��� ����");
        else
            System.out.println("�� ���ڿ��� �ٸ���");
    }
}
