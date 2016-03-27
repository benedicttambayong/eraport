package eraport;

import javax.swing.JOptionPane;
import DesainAdmin.*;


public class ERaport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            database db = new eraport.database();
            Login l = new DesainAdmin.Login();
            l.setVisible(true);
        } catch (Exception e)
        {
        javax.swing.JOptionPane.showMessageDialog(null,"Error apa "+e.getMessage(),"Start error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
