package seu.edu.cn.year2022.month03;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(20);
        linkedList.add(21);
        linkedList.add(22);
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
    }
}
