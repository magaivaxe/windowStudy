/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

/**
 *
 * @author eleves
 */
public class Window
{
    //Window object declaration 
    static JFrame window;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Class instantiation by inheriting
        window = new FirstWindow();
        
        //Window visible as boolean
        window.setVisible(true);
        
    }
    
}
