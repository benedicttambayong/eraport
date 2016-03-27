package eraport;

import java.sql.SQLException;

public class guru 
{
    
   private String nip,telp,tgllahir,tahunlahir,nama,alamat,agama,statuskawin,email,tempatlahir,jeniskelamin,mapel,bulanlahir;
    
    public void setnip(String nip)
    {
        this.nip=nip;
    }
    public void settelp(String telp)
    {
        this.telp=telp;
    }
    public void settgllahir(String tgl)
    {
        tgllahir=tgl;
    }
    public void settahunlahir(String tahun)
    {
        tahunlahir=tahun;
    }
    public void setnama(String nama)
    {
        this.nama=nama;
    }
    public void setalamat(String alamat)
    {
        this.alamat=alamat;
    }
    public void setagama(String agama)
    {
        this.agama=agama;
    }
    public void setstatuskawin(String status)
    {
        statuskawin=status;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    public void settempatlahir(String tempatlahir)
    {
        this.tempatlahir=tempatlahir;
    }
    public void setbulanlahir(String bulanlahir)
    {
        this.bulanlahir=bulanlahir;
    }
    public void setjeniskelamin(String jk)
    {
        jeniskelamin=jk;
    }
    public void setmapel(String mapel)
    {
        this.mapel=mapel;
    }
    public String getnip()
    {
        return nip;
    }
    public String gettelp()
    {
        return telp;
    }
    public String gettgllahir()
    {
        return tgllahir;
    }
    public String gettahunlahir()
    {
       return tahunlahir;
    }
    public String getnama()
    {
        return nama;
    }
    public String getalamat()
    {
        return alamat;
    }
    public String getagama()
    {
        return agama;
    }
    public String getstatuskawin()
    {
       return statuskawin;
    }
    public String getemail()
    {
        return email;
    }
    public String gettempatlahir()
    {
        return tempatlahir;
    }
    public String getbulanlahir()
    {
        return bulanlahir;
    }
    public String getjeniskelamin()
    {
        return jeniskelamin;
    }
    public String getmapel()
    {
        return mapel;
    }
    
    database d = new database();
    
    public void registerguru () throws SQLException
            {
                String ss = "select * from guru where nip='"+getnip()+"'";
                d.rs = d.getdata(ss);
                String s;
                 if(d.rs.next())
                 {
                    s = "update guru"
                        + " set nip='"+getnip()+"',nama = '"+getnama()
                        +"',alamat='"+getalamat()
                        +"',agama='"+getagama()
                        +"',status='"+getstatuskawin()
                        +"',telp='"+gettelp()
                        +"',email='"+getemail()
                        +"',tempat_lahir='"+gettempatlahir()
                        +"',tanggal_lahir='"+gettahunlahir()+""+getbulanlahir()+""+gettgllahir()
                        +"',jk='"+getjeniskelamin()
                        +"',mapel='"+getmapel()
                        +"' where nip= '"+getnip()+"'"; 
                 }
                 else
                 { 
                     s = "insert into guru values ('"+getnip()+"','"+getnama()+"','"+getalamat()+"','"+getagama()+"','"+getstatuskawin()+"','"+gettelp()+"','"+getemail()+"','"+gettempatlahir()+"','"+gettahunlahir()+""+getbulanlahir()+""+gettgllahir()+ "','"+getjeniskelamin()+"','"+getmapel()+"')";
                 }
                     d.query(s);
                javax.swing.JOptionPane.showMessageDialog(null,"Data berhasil dimasukkan");
                 
            }
    
    public void deleteguru (String nip) throws SQLException
            {
                 String s = "delete from guru where nip='"+nip+"'";
                 d.query(s);
                 javax.swing.JOptionPane.showMessageDialog(null,"Data berhasil dihapus");
            }
}
                 
                

    
    
  

