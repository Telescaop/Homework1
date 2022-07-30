package Fighter;

import java.awt.*;

public class Bullet {
    private int x;
    private int y;
    private int index=0;
    private boolean live=true;
    private final int WIDTH=20;
    private final int HEIGHT=20;
    private Image[] m_Bullet =new Image[4];
    private Toolkit kit =Toolkit.getDefaultToolkit();

    public Bullet(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void create(Graphics g){
        g.drawImage(m_Bullet[index],this.x,this.y,this.WIDTH,this.HEIGHT,null);
        move();
    }
    public void move(){
        this.y-=10;
        if(y<0){
            live =false;
        }
    }
    public boolean hit(Enemy enemy){
        Rectangle miss =this.getRect();
        Rectangle m_enemy=enemy.getRect();
        if(miss.intersects(m_enemy)){
            live=false;
            enemy.live=false;
            return true;
        }
        return false;
    }
    public Rectangle getRect(){
        return new Rectangle(this.x,this.y,this.WIDTH,this.HEIGHT);
    }

}
