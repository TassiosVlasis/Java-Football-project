public class Midfielders extends Player{
     public  Midfielders(String name, int number ,int x, int y, String Omada){
        super(name, number, x, y, Omada);
        
    }
    public void specialMove(Ball ball,Player p){
        
        int x,y;
        x=p.getXp();
        y=p.getYp();
        if(x==ball.getX() && y==ball.getY()){
           int targetLine = (int)(Math.random() * 7 + 0);
           
           ball.setX(targetLine);
            
            int random = (int )(Math.random() * 5 + 0);
            ball.setY(random);
    }
}
}
    