package Homework1;
import java.util.Scanner;
public class Dome {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        //构造对象，用于检验
        CardLost s1 =new CardLost("唐僧","2013-7-20 20:20","2121215010","第五教学楼");
        CardLost s2 =new CardLost("孙悟空","2013-7-21 10:20","2121215010","第三教学楼");
        CardLost s3 =new CardLost("猪八戒","2013-7-25 20:20","2121215010","第六教学楼");
        CardLost s4 =new CardLost("沙和尚","2013-7-22 20:20","2121215010","第二教学楼");
        CardLost s5 =new CardLost("白龙马","2013-7-23 20:20","2121215010","第一教学楼");
        BookLost t1=new BookLost("百年孤独","2013-7-20 20:20","第四教学楼");
        BookLost t2=new BookLost("飘","2012-5-7 20:20","第七教学楼");
        BookLost t3=new BookLost("红楼梦","2012-11-21 20:20","第二教学楼");
        BookLost t4=new BookLost("活着","2012-4-15 20:20","第三教学楼");
        //构造Lost数组
        Lost[] lostArray={s1,s2,s3,s4,s5,t1,t2,t3,t4};
        //检验sortLost函数，并将排序后的成员用toStirng方法输出
        Homework1.Solution.sortLost(lostArray);
        for(Lost str :lostArray){
            System.out.println(str.toString());
        }
        System.out.println("------------------------------------------------");
        //检验selectByKeyword函数
        System.out.print("请输入关键字：");
        String keyword=cin.next();
        System.out.println(Homework1.Solution.selectByKeyword(lostArray,keyword));
    }
}