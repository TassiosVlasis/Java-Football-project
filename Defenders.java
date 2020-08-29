public class Defenders extends Player{
    private boolean yellowCard=false;
    private int Interceptions=0;
    public  Defenders(String name, int number ,int x, int y, String Omada){
        super(name, number, x, y, Omada);
        
    }
    
  
public void specialMove(Ball ball,Player p){
    String tempTeam = getOmada();
    if((tempTeam!=p.getOmada() && ball.getCurrentPlayer()==p) && ((p.getX()-ball.getX() >= -1 || p.getX()<= 1) && (p.getY()-ball.getY() >= -1 || p.getY()<= 1) )){
            int random = (int )(Math.random() * 100 + 1);
            if(random<=70){
                Interceptions++;
               ball.ChangePossession(p);
            }
            else{
                int random2 = (int )(Math.random() * 100 + 1);
                if(random2<=20){
                    if(yellowCard!=true){
                        yellowCard = true;
                        
                    }
                    else{
                        p = null;
                    }
                }
                    
                }
            }
                
            
    }  
    
}