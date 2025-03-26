package Easy;


import Heap.Heap;

import java.util.ArrayList;

public class firstProgram {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<Integer>();

        heap.insert(40);
        heap.insert(35);
        heap.insert(32);
        heap.insert(37);
        heap.insert(42);
        heap.insert(39);

        ArrayList list = heap.heapSort();
        System.out.println(list);

    }
}
