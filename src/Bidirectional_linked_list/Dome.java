package Bidirectional_linked_list;

public class Dome {
    public static void main(String[] args) {
        Linked_list<Integer> List =new Linked_list<>();
        for(int i=0;i<6;i++){
            List.insertFirst(i);
        }
        for(int i=0;i<6;i++){
            List.insertLast(i);
        }
        List.print();
    }
}
