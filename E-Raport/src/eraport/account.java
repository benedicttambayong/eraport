
package eraport;

import DesainAdmin.Login;
import DesainAdmin.MenuUtamaAdmin;
import DesainGuruMapel.MenuUtamaGuruMapel;
import DesainWaliMurid.MenuUtamaWaliMurid;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class account {
    private String username,passw,nip,email,jenis;
    eraport.database d = new database();
    
    public void setnip(String nip)
    {
        this.nip=nip;
    }
    
    public void setemail(String email)
    {
        this.email=email;
    }
    
    public void setusername(String username)
    {
        this.username=username;
    }
    
    public void setpassw(String passw)
    {
        this.passw=passw;
    }
    
    public void setjenis(String jenis)
    {
        this.jenis=jenis;
    }
    
    public String getnip()
    {
        return nip;
    }
    
    public String getemail()
    {
        return email;
    }
    
    public String getusername()
    {
        return username;
    }
    
    public String getpassw()
    {
        return passw;
    }
    
    public String getjenis()
    {
        return jenis;
    }
    
    public void login (String username, String passw, String jenis) throws SQLException
            {
                String s = "select * from account where username ='"+username+"' and password='"+passw+"' and jenis='"+jenis+"'";
                d.rs = d.getdata(s);
                if(d.rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "Logged in");
                    if(null != jenis)
                    switch (jenis) {
                        case "Admin":
                            MenuUtamaAdmin mu = new DesainAdmin.MenuUtamaAdmin();
                            mu.setVisible(true);
                            break;
                        case "Wali Kelas":
                            MenuUtamaWaliMurid wm = new DesainWaliMurid.MenuUtamaWaliMurid();
                            wm.setVisible(true);
                            break;
                        case "Guru Mapel":
                            MenuUtamaGuruMapel gm = new DesainGuruMapel.MenuUtamaGuruMapel();
                            gm.setVisible(true);
                            break;
                    }
            }else{
                JOptionPane.showMessageDialog(null, "Wrong user or password");
            }
        
            } 
    public void register () throws SQLException
            {
                String ss = "select * from account where nip='"+getnip()+"'";
                d.rs = d.getdata(ss);
                String s;
                 if(d.rs.next())
                 {
                    s = "update account"
                        + " set nip='"+getnip()+"',email = '"+getemail()
                        +"',username='"+getusername()
                        +"',password='"+getpassw()
                        +"',jenis='"+getjenis()
                        +"' where nip= '"+getnip()+"'"; 
                 }
                 else
                 {   s = "insert into account values ('"+getnip()+"','"+getusername()+"','"+getpassw()+"','"+getemail()+"','"+getjenis()+"')";
                 }
                 d.query(s);
                javax.swing.JOptionPane.showMessageDialog(null,"Data berhasil dimasukkan");
               
            }
     public void delete (String nip) throws SQLException
            {
                
                 String s = "delete from account where nip='"+nip+"'";
                 
                 d.query(s);
                 javax.swing.JOptionPane.showMessageDialog(null,"Data berhasil dihapus");
            }
}
