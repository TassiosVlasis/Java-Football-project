public class Strikers extends Player{
    private int orio;//ta oria ths grammhs
    private int yp;
    public Strikers(String name, int number ,int x, int y, String Omada){
        super(name, number, x, y, Omada);
        
    }
    
    public void specialMove(Ball k,Player player){
    
     int specialTruck = (int )(Math.random() * 1 + 0);
     //eksetazoume oti exei th mpala o sympaikths
     yp = getYp();
     if(specialTruck == 1){
         if(specialTruck == 0 && orio>0){
             
            yp=yp-2;
            setYp(yp);}
        else if(specialTruck == 1 && orio<5){
            yp=yp+2;
            setYp(yp);
        
        }
        
            
        
   // kanoume anazitisi kai briskoume to kontinotero antipalo paixth sthn idia grammh,afou kanoume thn anazitisi me 1 paei arister kai 0 deksia
    }
}
}

