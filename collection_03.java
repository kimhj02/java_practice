package collection;
//����� �ν��Ͻ��� ������ ���� ��� 1 : enhanced for���� ���

import java.util.List;
import java.util.LinkedList;

public class collection_03 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        //�ν��Ͻ� ����
        list.add("toy");
        list.add("box");
        list.add("robot");

        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();

        list.remove(0);

        //��ü �ν��Ͻ� ����
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();
    }
}
