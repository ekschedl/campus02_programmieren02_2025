package u_LogisticManager__ArrLi_____Interface;
import java.util.ArrayList;

public class LogisticManager {
    private ArrayList<Moveable> list;

    public LogisticManager(){
        list = new ArrayList<>();
    }
    public void add(Moveable m){
        list.add(m);
    }
    public void moveAll(String destination){
        for(Moveable m : list){
            m.move(destination);
        }
    }
}