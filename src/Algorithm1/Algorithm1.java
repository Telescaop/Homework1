package Algorithm1;

import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int time=0;
        System.out.print("请输入购票的人数:");
        int n =cin.nextInt();
        int[] tickets=new int[n];
        for(int i=0;i<tickets.length;i++) {
            System.out.print("请输入第"+(i+1)+"个人所需购票数:");
            tickets[i]=cin.nextInt();
        }
        System.out.print("请输入你所需要的第k个人:");
        int k=cin.nextInt();
        for(int i=0;i<tickets.length;i++) {
            if(i<=k){
                time+=Math.min(tickets[k],tickets[i]);
            }else time+=Math.min(tickets[k]-1,tickets[i]);
        }
        System.out.println("第"+k+"个人所需要的时间为:"+time);
    }
}
