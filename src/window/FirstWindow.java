/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * The interface implements mouseListener imports all superTypes methods override
 * from MouseListener
 * @author Marcos Gomes
 */
public class FirstWindow extends JFrame implements MouseListener
{
    //Class constructor that inherit the imports and methods
    public FirstWindow() 
    { 
        //Set the window title 
        setTitle("Clicks");
        //Set the window size: width and height
        //setSize(500, 500);
        //Change the dimension values and window position: x, y, width, height
        setBounds(650, 200, 600, 600);
        //Window visible as boolean
        setVisible(true);
        //This window will be himself the listener of mouse events. But the listener
        //can be other class 
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Click on window");
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        
    }
    
    
    
    
    
    
    
    
    
}
