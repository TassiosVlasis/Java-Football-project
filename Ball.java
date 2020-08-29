public class Ball{
    private int x,y;
    private Player currentPlayer, previousPlayer=null;
    public Ball(int x,int y){
        this.x=x;
        this.y=y;
  }

    public int  getX(){
        return x;}

    public void setX(int x){
        this.x=x;}

    public int getY(){
        return y;}
    public void setY(int y){
        this.y=y;}
    public void giveBall(Player p){
        if(currentPlayer==null && (p.getXp()-x >= -1 || p.getXp()<= 1) && (p.getYp()-y >= -1 || p.getYp()<= 1) ){
            x=p.getXp();
            y=p.getYp();
            currentPlayer=p;
            
    }
        
}
    public Player getCurrentPlayer(){
        return currentPlayer;
        
        }
        public void ChangePossession(Player p){
            previousPlayer=currentPlayer;
            currentPlayer=p;
            x=p.getXp();
            y=p.getYp();
        }
    }

