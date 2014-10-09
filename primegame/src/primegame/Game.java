/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primegame;
import javax.swing.JFrame;

/**
 *
 * @author annie
 */
public class Game extends JFrame{
    
    public Game(){
    super("Prime Game");
    Game frame = new Game();
    getContentPane().add(frame);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(800,650);
    setVisible(true);
   
    }
}
