package collection;

//�ڹ��� arraylist<e> Ŭ����

import java.util.List;
import java.util.ArrayList;

public class collection_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("toy");
        list.add("box");
        list.add("robot");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + '\t');
        }
        System.out.println();

        list.remove(0); //�ε��� 0�� �ִ� �� ����

        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + '\t');
        }
        System.out.println();
    }
}