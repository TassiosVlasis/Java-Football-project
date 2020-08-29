import java.util.*;
public class Team{
    ArrayList<Player> PlayerList = new ArrayList<Player>();
    private String teamName;
    private int mistakes;
    private int passes;
    private int goals;
    public String getTeamName(){
        return teamName;}
    public void action(Player p,int d,Ball ball,int targetLine){
        int random = (int )(Math.random() * 100 + 0);
        if(random>=0 ||random<=35){
            p.move(d);//d einai direction,kateythinsh,deksia aristera
        }else if(random>=35 || random<=70){
            p.throwball(ball,targetLine);
        }
        else{
            p.specialMove(ball,p);

        }
        ball.giveBall(p);
    }
}
