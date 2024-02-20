package collection;

//자바의 arraylist<e> 클래스

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

        list.remove(0); //인덱스 0에 있는 값 삭제

        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + '\t');
        }
        System.out.println();
    }
}