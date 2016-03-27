package eraport;

import java.sql.SQLException;

public class siswa 
{
     
    private String nis,telp,tgllahir,bulanlahir, tahunlahir,nama,alamat,agama,email,tempatlahir,jeniskelamin,skhu,kelas,ijasah,tahunajaran;
    
    public void setnis(String nis)
    {
        this.nis=nis;
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
    public void setskhu(String skhu)
    {
        this.skhu=skhu;
    }
    public void setijasah(String ijasah)
    {
        this.ijasah=ijasah;
    }
    public void setkelas(String kelas)
    {
        this.kelas=kelas;
    }
    public void settahunajaran(String tahunajaran)
    {
        this.tahunajaran=tahunajaran;
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
    
    public String getnis()
    {
        return nis;
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
    
    public String getemail()
    {
        return email;
    }
    public String    gettempatlahir()
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
    public String getskhu()
    {
        return skhu;
    }
    public String getijasah()
    {
        return  ijasah;
    }
    public String getkelas()
    {
        return  kelas;
    }
    public String gettahunajaran()
    {
        return tahunajaran;
    }
    
    database d = new database();
    
    public void registersiswa () throws SQLException
            {
                String ss = "select * from siswa where nis='"+getnis()+"'";
                d.rs = d.getdata(ss);
                String s;
                 if(d.rs.next())
                 {
                    s = "update siswa"
                        + " set nis='"+getnis()+"',nama = '"+getnama()
                        +"',alamat='"+getalamat()
                        +"',agama='"+getagama()
                        +"',telp='"+gettelp()
                        +"',email='"+getemail()
                        +"',tempat_lahir='"+gettempatlahir()
                        +"',tanggal_lahir='"+gettahunlahir()+""+getbulanlahir()+""+gettgllahir()
                        +"',jk='"+getjeniskelamin()
                        +"',skhu='"+getskhu()+"',kelas='"+getkelas()+"',ijasah='"+getijasah()
                        +"',tahunajaran='"+gettahunajaran()
                        +"' where nis= '"+getnis()+"'"; 
                 }
                 else
                 {  s = "insert into siswa values ('"+getnis()+"','"+getnama()+"','"+getalamat()+"','"+getagama()+"','"+gettelp()+"','"+getemail()+"','"+gettempatlahir()+"','"+gettahunlahir()+""+getbulanlahir()+""+gettgllahir()+ "','"+getjeniskelamin()+"','"+getskhu()+"','"+getkelas()+"','"+getijasah()+"','"+gettahunajaran()+"')";
                 }
                 d.query(s);
                javax.swing.JOptionPane.showMessageDialog(null,"Data berhasil dimasukkan");
               
            }
     public void deletesiswa(String nis) throws SQLException
            {
                 String s = "delete from siswa where nis='"+nis+"'";
                 d.query(s);
                 javax.swing.JOptionPane.showMessageDialog(null,"Data berhasil dihapus");
            }
}
