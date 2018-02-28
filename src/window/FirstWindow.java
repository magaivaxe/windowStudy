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
public class FirstWindow extends JFrame
{
    //Class constructor that inherit the imports and methods
    public FirstWindow() 
    { 
        //Set the window title 
        setTitle("My first window");
        //Set the window size: width and height
        //setSize(500, 500);
        //Change the dimension values and window position: x, y, width, height
        setBounds(650, 200, 600, 600);
        //Window visible as boolean
        setVisible(true);
    }
}
