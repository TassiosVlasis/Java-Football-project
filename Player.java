import java.lang.*;
public abstract class Player{
    private int x,y;
    private String name;
    private int number;
    private int line;
    private String Omada;//h omada tou ka8e paikth
    public void setYp(int y){
        this.y=y;
    }
    public int getXp(){
        return x;
    }
    public int getYp(){
        return y;
    }
    public Player(String name, int number ,int x, int y, String Omada){
        this.x = x;
        line=x;
        this.y = y;
        this.name = name;
        this.number = number;
        this.Omada = Omada;    
    }
    public void move(int tomove){
        if(tomove == 0 && y>0){
            y=y-1;}
        else if(tomove == 1 && y<5){
            y=y+1;
        }
        }
    public void throwball(Ball ball, int targetLine){
        if(x==ball.getX() && y==ball.getY()){
            ball.setX(targetLine);
            int random = (int )(Math.random() * 5 + 0);
            ball.setY(random);
        }
    }
     public abstract void specialMove(Ball ball, Player p);
     public String getOmada(){
         return Omada;
     }
            
            
            
        
    

}