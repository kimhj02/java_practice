package collection;

//����� �ν��Ͻ��� ������ ���� ��� 2 itorator�� Ȱ����
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
        //�ݺ��ڸ� �̿��� ������ ����
        while(itr.hasNext())
            System.out.print(itr.next() + '\t');
        System.out.println();

        itr = list.iterator();

        //��� "box" ����
        String str;
        while(itr.hasNext())
        {
            str = itr.next();
            if(str.equals("box"))
                itr.remove();
        }

        itr = list.iterator();  //�ݺ��� �ٽ� ȹ��

        //���� �� ��� Ȯ��
        while(itr.hasNext())
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}