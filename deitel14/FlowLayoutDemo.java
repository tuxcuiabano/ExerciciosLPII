/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel14;

/**
 *
 * @author tuxcuiabano
 */
import javax.swing.JFrame;

public class FlowLayoutDemo 
{
   public static void main( String[] args )
   { 
      FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame(); 
      flowLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      flowLayoutFrame.setSize( 300, 75 ); // set frame size
      flowLayoutFrame.setVisible( true ); // display frame
   } // end main
} // end class FlowLayoutDemo
