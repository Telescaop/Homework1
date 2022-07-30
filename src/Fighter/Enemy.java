package Fighter;

import java.awt.*;
import java.util.Random;

public class Enemy implements Runnable{
    private int x;
    private int y;
    private int dir=0;
    protected boolean live=true;
    private final int WIDTH=50;
    private final int HEIGHT=50;
    private Image[] m_Bullet =new Image[4];
    private Toolkit kit =Toolkit.getDefaultToolkit();
    private int n;
    public void create(Graphics g){
        this.n--;
        if(this.n<=0){
            this.dir =new Random().nextInt(3);
            this.n=new Random().nextInt(10)+10;
        }
        g.drawImage(m_Bullet[this.dir],this.x,this.y,this.WIDTH,this.HEIGHT,null);
        move();
        int f=new Random().nextInt(1000);
        if(f>100){
            fire();
        }
    }
    public void move(){
        y+=5;
        if(dir==0){
            x-=5;
        }else if(dir==2){
            x+=5;
        }else if(x<=0){
            x=5;
        }else if(x>=500-this.WIDTH){
            x=this.WIDTH;
        }else if(y==8){
            live=false;
        }
    }
    public Rectangle getRect(){
        return new Rectangle(x,y,this.WIDTH,this.WIDTH);
    }
    public void fire(){
        Bullet m=new Bullet(this.x,this.y);
    }
    public void run() {
        Random r = new Random();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


























