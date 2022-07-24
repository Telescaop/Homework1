package Bidirectional_linked_list;

public class Linked_list<T> {
    private Link first;
    private Link last;
    public Linked_list(){
        first=null;
        last=null;
    }
    public void insertFirst(T data){
        Link newNum =new Link(data);
        if(isEmpty()){
            this.last=newNum;
        }
        else {
            first.previous=newNum;
        }
        newNum.next=first;
        first=newNum;
    }
    public void insertLast(T data){
        Link newNum=new Link(data);
        if(isEmpty()){
            this.first=newNum;
        }
        else{
            newNum.previous =this.last;
            this.last.next=newNum;
        }
        this.last=newNum;
    }
    public Link deleteFirst() {
        Link temp = this.first;
        if(this.first.next==null) {
            this.last = null;
        }
        else {
            first.next.previous = null;
        }
        this.first = this.first.next;
        return temp;
    }
    public Link deleteLast() {
        Link temp = this.last;
        if(this.first.next == null) {
            this.first = null;
        }else {
            this.last.previous.next = null;
        }
        this.last = this.last.previous;
        return temp;
    }
    public void insertAfter(T key,T data){
        Link newNum = new Link(data);
        Link current =this.first;
        while ((current!=null)&&(current.data!=key)){
            current=current.next;
        }
        if(current==null){
            if(isEmpty()){
                this.first=newNum;
            }
            else {
                this.last.next=newNum;
                newNum.previous=last;
            }
            this.last=newNum;
        }
        else {
            if(current==last){
                newNum.next=null;
                this.last=newNum;
            }
            else {
                newNum.next=current.next;
                current.next.previous=newNum;
            }
            current.next=newNum;
            newNum.previous=current;
        }
    }
    public void print(){
        Link current =first;
        while(current!=null){
            current.display();
            current=current.next;
        }
        System.out.println();
    }
    private boolean isEmpty() {
        return (first==null);
    }
}
