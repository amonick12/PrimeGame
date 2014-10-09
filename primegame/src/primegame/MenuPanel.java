/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primegame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author annie
 */
public class MenuPanel extends JPanel implements ActionListener{
    JSlider amountOfBlocks;
    JSlider setTime;

    public MenuPanel(){
        amountOfBlocks = new JSlider(9,16,25);
        setTime = new JSlider(30,60,120);        
    }
    
    public void getTime(){
        
    }
    
    public int getNumOfButtons(){
        
        return 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
