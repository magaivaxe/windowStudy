/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Marcos Paulo Salgado Gomes
 */
public class KeyboardEntry
{
    public String readString()
    {
        //Local variables
        String read_line = null;
        /**
         * Create a "reader" variable of type InputStreamReader and pointer 
         * to the method System.in;
         * Create an "entry" variable of type BufferedReader and pointer
         * to the reader;
         */
        try
        { 
            //Reader declaration
            InputStreamReader reader = new InputStreamReader(System.in);
            //Entry declaration and read the reader
            BufferedReader entry = new BufferedReader(reader);
            //Atribution to read_line the entry value by the method readLine type String
            read_line = entry.readLine();
        }
        catch (IOException err) { System.exit(0); }
        //Return the variable with String value
        return read_line;
    }
    /**
     * Create a float and try readString and parseFloat.
     * Else it will be a error NumberFormatException
     * @return A float number conversed from a string
     */
    public float readFloat()
    {
        float number = 0;
        try
        {
            String read_line = readString();
            number = Float.parseFloat(read_line);
        }
        catch (NumberFormatException err)
        {
            System.out.println("*** Entry error ***");
            System.exit(0);
        }
        return number;
    }
    /**
     * Create a double and try readString and parseDouble.
     * Else it will be a error NumberFormatException
     * @return A double number conversed from a string
     */
    public double readDouble()
    {
        double number = 0;
        try
        {
            String read_line = readString();
            number = Double.parseDouble(read_line);
        }
        catch (NumberFormatException err)
        {
            System.out.println("*** Entry error ***");
            System.exit(0);
        }
        return number;
    }
    /**
     * Create a integer and try readString and parseDouble.
     * Else it will be a error NumberFormatException
     * @return A integer number conversed from a string
     */
    public double readInteger()
    {
        int number = 0;
        try
        {
            String read_line = readString();
            number = Integer.parseInt(read_line);
        }
        catch (NumberFormatException err)
        {
            System.out.println("*** Entry error ***");
            System.exit(0);
        }
        return number;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
