/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habitatdatathread;

import java.awt.image.BufferedImage;

/**
 *
 * @author iUser
 */
public interface IBehaviour {
    /**
     * ������� ������ ����������� �������� ������
     * @return 
     */
    String Beep();

    boolean setPic(BufferedImage pic);
    
    BufferedImage getPic();
    
    
    

}
