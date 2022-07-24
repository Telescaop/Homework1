package Bidirectional_linked_list;

import jdk.swing.interop.SwingInterOpUtils;

public class Link<T>{
    public T data;
    public Link next;
    public Link previous;
    public Link(T data){
        super();
        this.data=data;
    }
    public void display() {
        System.out.println("（"+data+")");
    }
}
