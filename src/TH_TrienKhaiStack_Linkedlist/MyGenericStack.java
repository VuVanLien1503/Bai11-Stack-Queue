package TH_TrienKhaiStack_Linkedlist;

import java.util.LinkedList;

public class MyGenericStack<E> {
    private LinkedList<E> stack;

    public MyGenericStack() {
        stack=new LinkedList<>();
    }

    public void  push(E e){
        stack.addFirst(e);
    }



}
