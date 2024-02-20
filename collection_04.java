package collection;

//저장된 인스턴스의 순차적 접근 방법 2 itorator을 활용한
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class collection_04 {
    public static void main(String[] args) 
    {
        List<String> list = new LinkedList<>();
        list.add("toy");
        list.add("box");
        list.add("robot");
        list.add("box");

        Iterator<String> itr = list.iterator();
        //반복자를 이용한 순차적 참조
        while(itr.hasNext())
            System.out.print(itr.next() + '\t');
        System.out.println();

        itr = list.iterator();

        //모든 "box" 삭제
        String str;
        while(itr.hasNext())
        {
            str = itr.next();
            if(str.equals("box"))
                itr.remove();
        }

        itr = list.iterator();  //반복자 다시 획득

        //삭제 후 결과 확인
        while(itr.hasNext())
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}