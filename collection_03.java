package collection;
//저장된 인스턴스의 순차적 접근 방법 1 : enhanced for문의 사용

import java.util.List;
import java.util.LinkedList;

public class collection_03 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        //인스턴스 저장
        list.add("toy");
        list.add("box");
        list.add("robot");

        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();

        list.remove(0);

        //전체 인스턴스 참조
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();
    }
}
