/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package log;

import java.awt.Color;
import javax.swing.text.*;
import ui.MainForm;

/**
 *
 * @author BLIS
 */
public class AddToDisplay {
    
    public synchronized static void Display(String data, int type)
    {
       
        StyledDocument doc = MainForm.jtxtPaneDisplay.getStyledDocument();
        //  Define a keyword attribute

        SimpleAttributeSet keyWord = new SimpleAttributeSet();
        switch(type)
        {
            case 0:
                StyleConstants.setForeground(keyWord, Color.BLACK);
                break;
            case 1:
                StyleConstants.setForeground(keyWord, Color.BLUE);
                 StyleConstants.setBold(keyWord, true);
                break;
            case 2:
                StyleConstants.setForeground(keyWord, Color.RED);
                break;
            case 3:
                StyleConstants.setForeground(keyWord, Color.RED);
                break;
                
        }              
        try
        {
            //doc.insertString(0, data+"\n", keyWord );
            doc.insertString(doc.getLength(), data+"\n", keyWord );  
            MainForm.jtxtPaneDisplay.setCaretPosition(doc.getLength());
            log.logger.Logger(data);            
        }
        catch(BadLocationException e) { System.out.println(e); }
            }
    
}
//HERE