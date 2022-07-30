package Algorithm3;

import java.util.LinkedList;

public class AnimalShelf {
    private final int RECEIVE =20000;
    private LinkedList<Integer> Cat =new LinkedList<Integer>();
    private LinkedList<Integer> Dog =new LinkedList<Integer>();
    private int Receive;
    public void enqueue(int animal){
        if(Receive<RECEIVE){
            if(animal==0){
                this.Cat.add(animal);
            }else if(animal==1){
                this.Dog.add(animal);
            }else System.out.println("不收取除猫狗之外的动物。");
        }else System.out.println("已到达最大收容量。");
    }
    public void dequeueAny(){
        System.out.println("狗:");
        if(Dog!=null) {
            for (int i = 0; i < Dog.size(); i++) {
                System.out.println("1"+Dog.get(i));
            }
        }else System.out.println("-1,-1");
        System.out.println("猫:");
        if(Cat!=null) {
            for (int i = 0; i < Cat.size(); i++) {
                System.out.println("1"+Cat.get(i));
            }
        }else System.out.println("-1,-1");
    }
    public void dequeueDog(){
        if(Dog!=null) {
            for (int i = 0; i < Dog.size(); i++) {
                System.out.println("1"+Dog.get(i));
            }
        }else System.out.println("-1,-1");
    }
    public void dequeueCat(){
        if(Cat!=null) {
            for (int i = 0; i < Cat.size(); i++) {
                System.out.println("1"+Cat.get(i));
            }
        }else System.out.println("-1,-1");
    }
}












