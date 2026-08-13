
import java.util.*;


interface Updater{
    public void update(CricketScoreboard cricketScoreBoard);
}


interface CricketScore{
    public void addUpdater(Updater updater);
    public void removeUpdater(Updater updater);
    public void notifyy();
}


class CricketScoreboard implements CricketScore{

        int currun;
        int curscore=120;
        int overscore=0;


     List<Updater> updaters=new ArrayList<>();




    public  void updateCricketScoreboard(int currun) {
        this.currun = currun;
        this.notifyy();
        
    }

    @Override
    public void addUpdater(Updater updater) {
        updaters.add(updater);
    }

    @Override
    public void removeUpdater(Updater updater) {
        updaters.remove(updater);
    }

    



    @Override
    public void notifyy() {
         for(Updater updater: updaters){
            updater.update(this);
        }
        

        
    }

}

class ScoreUpdater implements Updater{

    @Override
    public void update(CricketScoreboard cricketScoreBoard) {
        cricketScoreBoard.curscore+=cricketScoreBoard.currun;
        System.out.println("current score is " +cricketScoreBoard.curscore);


    }
   

}

class OverScoreUpdater implements Updater{

    @Override
    public void update(CricketScoreboard cricketScoreBoard) {
        cricketScoreBoard.overscore+=cricketScoreBoard.currun;
        System.out.println("over score is " +cricketScoreBoard.overscore);

       
    }

   

}

public class Main {

    public static void main(String[] args){
        CricketScoreboard cricketscoreBoard = new CricketScoreboard();

            cricketscoreBoard.addUpdater(new ScoreUpdater());
            cricketscoreBoard.addUpdater(new OverScoreUpdater());
            cricketscoreBoard.updateCricketScoreboard(6);
            cricketscoreBoard.updateCricketScoreboard(0);
            cricketscoreBoard.updateCricketScoreboard(4);
            



    }
    
}

/*
current score is 126
over score is 6
current score is 126
over score is 6
current score is 130
over score is 10
 */
