package collection;

import java.util.List;
import java.util.LinkedList;

public class collection_02 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("toy");
        list.add("box");
        list.add("robot");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + '\t');
        }
        System.out.println();

        list.remove(0);
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + '\t');
        }
        System.out.println();
    }
}