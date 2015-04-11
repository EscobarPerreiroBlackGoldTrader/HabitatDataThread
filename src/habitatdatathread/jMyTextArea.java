/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habitatdatathread;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author iUser
 */
public class jMyTextArea extends JTextArea implements Runnable{
    private PipedReader pr;

    
    public jMyTextArea(){} 
    
    public jMyTextArea(PipedWriter pw) {
        try {
            this.pr = new PipedReader(pw);
        } catch (IOException ex) {
            Logger.getLogger(jMyTextArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void initPW(PipedWriter pw){
        try {
            this.pr = new PipedReader(pw);
        } catch (IOException ex) {
            Logger.getLogger(jMyTextArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public PipedReader getStream() {
        return pr;
    }
    
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("jMyTextArea Reeding ... " + pr.read());
            } catch (IOException ex) {
                Logger.getLogger(jMyTextArea.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("jMyTextArea Jobs finishing...");
            }
        }
    }
    
}
    
