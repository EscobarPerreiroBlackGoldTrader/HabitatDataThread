/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habitatdatathread;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iUser
 *  ласс созданный специально чтобы выполн€€сь в отдельном потоке 
 * обновл€ть экран программы (вызывать метод repaint() с периодичностью 
 * хран€щейс€ в константе CLOCK_RATE котора€ определена в Habitat)
 */
public class gUpdater implements Runnable/*extends TimerTask*/{
    Habitat mainT;
    
    gUpdater(Habitat  maintread){
        this.mainT = maintread;
    }
    
    @Override
    public void run(){
        while(true){
            mainT.repaint();
            try {
                TimeUnit.MILLISECONDS.sleep(mainT.CLOCK_RATE);
            } catch (InterruptedException ex) {
                Logger.getLogger(gUpdater.class.getName()).log(Level.SEVERE, null, ex);
            }
            Thread.yield();
            //++mainT.counter;
        }
    }
    
}
