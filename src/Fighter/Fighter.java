package Fighter;

import java.awt.*;
import java.util.Random;

public class Fighter implements Runnable{
   private int x;
   private int y;
   private boolean live =true;
   private int life =100;
   private final int WIDTH =50;
   private final int HEIGHT =50;
   private Image[] m_Fighter = new Image[4];
   private static Toolkit kit =Toolkit.getDefaultToolkit();
   private int index = 0;
   private Bullet bullet;
   public static boolean fire =false;
   public Fighter(int x,int y){
      this.x=x;
      this.y=y;
   }
   public void create(Graphics g){
      if(!live){
         return;
      }
      g.drawImage(this.m_Fighter[index],this.x,this.y,this.WIDTH,this.HEIGHT,null);
      if(fire){
         fire();
      }

   }
   public void fire(){
      Bullet m=new Bullet(this.x,this.y);
   }

   @Override
   public void run() {

   }
}
