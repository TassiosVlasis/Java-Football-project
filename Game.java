import java.io.*;
import java.util.*;
public class Game{
private int turnsPassed;
private int goalsA;
private int goalsB;
private int playerMoves;//posa koutakia kounhthike
private Player paikths;
private static String nm;
private static String num;
private static String tempx;
private static String tempy;
private static String plteam;
    public static void main(String[] args){

    Ball ball = new Ball(3,2);//arxikh thesh mpalas
    Team teamA = new Team();
    Team teamB = new Team();
    Game game = new Game();
    //8a valoume try-catch 'H exist
    String line = null;
    FileReader fileReader = 
                new FileReader("In.txt");
    BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
        while((line = bufferedReader.readLine()) != null) {
        nm= line;
        num= bufferedReader.readLine();
        tempx = bufferedReader.readLine();
        tempy = bufferedReader.readLine();
        plteam = bufferedReader.readLine();
        int num = Integer.parseInt(num);
        int tempx = Integer.parseInt(tempx);
        int tempy = Integer.parseInt(tempy);
        if(plteam == "TeamA"){
            
            if(tempx =="1" || tempx == "2"){
                  Defenders tempPlayer = new Defenders(nm,num,tempx,tempy,plteam);
                  PlayerList.add(tempPlayer);
                }
              else if(tempx == "3"){
                  Wing_Backs tempPlayer = new Wing_Backs(nm,num,tempx,tempy,plteam);
                  PlayerList.add(tempPlayer);
                }
              else if(tempx == "4"){
                  Midfielders tempPlayer = new Midfielder(nm,num,tempx,tempy,plteam);
                  PlayerList.add(tempPlayer);
                }
              else{
                  Strikers tempPlayer = new Strikers(nm,num,tempx,tempy,plteam);
                  PlayerList.add(tempPlayer);
                }
            }
        else{
            if(tempx == "1" || tempx == "2"){
                  Strikers tempPlayer = new Strikers(nm,num,tempx,tempy,plteam);
                  PlayerList.add(tempPlayer);
                }
              else if(tempx == "3"){
                  Midfielder tempPlayer = new Midfielder(nm,num,tempx,tempy,plteam);
                  PlayerList.add(tempPlayer);
                }
              else if(tempx == "4"){
                  Wing_Backs tempPlayer = new Wing_Backs(nm,num,tempx,tempy,plteam);
                  PlayerList.add(tempPlayer);
                }
              else{
                  Defenders tempPlayer = new Defenders(nm,num,tempx,tempy,plteam);
                  PlayerList.add(tempPlayer);
                }
            }
       
   }

   
 while ((goalsA==7 || goalsB==7) || turnsPassed == 100) {
   
     int ra1 = (int)(Math.random() * 7 + 0);
     int rb1 = (int)(Math.random() * 15 + 8);
    
     int r2 = (int)(Math.random() * 16 + 0);
     
       int r4 = (int)(Math.random() * 16 + 0);
    game.runTurn();
   
    if(x==0&& (x==2 || x==3)){
      
        int random = (int )(Math.random() * 1 + 0);
        if(random==1){
            goalsA++;
        }
    }
    if(x==7&& (x==2 || x==3)){
      
        int random = (int )(Math.random() * 1 + 0);
        if(random==1){
            goalsB++;
        }
    }
    turnsPassed++;

    
}   
}
public void runTurn(){
    int random = (int )(Math.random() * 1 + 0);
    if(random = 1){
         paikths = PlayerList.get(ra1);
        teamA.action(paikths,r2,ball,r4);
    }else{
         paikths = PlayerList.get(rb1);
        teamB.action(paikths,r2,ball,r4);
    }
    
    


}
}
