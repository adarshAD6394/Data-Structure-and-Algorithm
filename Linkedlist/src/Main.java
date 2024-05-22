import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // default available in Java
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(34);
//        System.out.println(list);

//         Create of integer type to understand its working.
        LL list1 = new LL();
        list1.insertFirst(3);
        list1.insertLast(5);
        list1.insertLast(7);
        list1.insertLast(8);
        list1.insertLast(199);
        list1.output();

        LL list2 = new LL();
        list2.insertFirst(2);
        list2.insertLast(4);
        list2.insertLast(6);
        list2.insertLast(9);
        list2.insertLast(99);
        list2.output();

//         Doubly Linkedlist

        DL list = new DL();
        list.insertFirst(10);
        list.insertFirst(12);
        list.insertFirst(14);
        list.insertFirst(16);
        list.insertFirst(18);
        list.insertLast(10);
        list.insertLast(8);
        list.insertLast(6);
        list.display();
        list.revDisplay();
        list.insert(34,2);
        list.display();

//      Circlar linkedlist
        CL c = new CL();
        c.insert(4);
        c.insert(5);
        c.insert(6);
        c.insert(7);
        c.insert(8);
        c.display();
        c.delete(4);
        c.display();





        }
        }
    }

