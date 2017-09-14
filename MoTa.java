/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

/**
 *
 * @author MINH HIEU
 */
 class ConMeo {
    private float CanNang;
    private String Ten,Loai;
    void keu(){
        System.out.println("Meo meo");
    };
     void setCanNang(float weight)
            {
                this.CanNang=weight;
                
            }
    void setTen(String name)
            {
                this.Ten=name;
                
            }
    void setLoai(String type)
            {
                this.Loai=type;
                
            }
    float getCanNang()
    {
        return this.CanNang;
    }
    String getTen()
    {
        return this.Ten;
    }
    String getLoai()
    {
        return this.Loai;
    }
}

class GiaoVien
{
    private String Ten,MonHoc;
    private int Tuoi;
    void giangbai()
    {
        System.out.println("Mot Hai Ba");
    }
    void setTen(String name)
    {
        this.Ten=name;
    }
    void setMonHoc(String subject)
    {
        this.MonHoc=subject;
    }
    void setTuoi(int age)
    {
        this.Tuoi=age;
    }
    String getTen()
    {
        return this.Ten;
    }
    String getMonHoc()
    {
        return this.MonHoc;
    }
    int getTuoi()
    {
        return this.Tuoi;
    }
}

        class MayBay{
            private String Ten,Loai;
            private int SoKhach;
            void Bay
            {
                System.out.println("u u u");
            }
            void setTen(String name)
            {
                this.Ten=name;
            }
            void setLoai(String type)
            {
                this.Loai=type;
            }
            void setSoKhach (int sl)
            {
                this.SoKhach=sl;
            }
            String getTen()
            {
                return this.Ten;
            }
            String Loai()
            {
                return this.Loai;
            }
            int getSoKhach()
            {
                return this.SoKhach;
            }
                    
}
          
        class Cay{
            private float ChieuCao;
            private String Loai;
            
            void setChieuCao(float height)
            {
                this.ChieuCao=height;
            }
            void setLoai(String type)
            {
                this.Loai=type;
            }
           float getChieuCao ()
            {
                return this.ChieuCao;
            }               
           String getLoai()
           {
                return this.Loai;
           }
 }
         class SinhVien{
         
             private String Ten,MSSV,Khoa;
             void study()
             {
             
             }
             void setTen(String name)
             {
                 this.Ten=name;
             }
             void setMSSV(String MS)
             {
                 this.MSSV=MS;
             }
             void setKhoa(String n)
             {
                 this.Khoa=n;
             }
             
             String getTen()
             {
                 return this.Ten;
             }
             String getMSSV()
             {
                 return this.MSSV;
             }
             String getKhoa()
             {
                 return this.Khoa;
             }
         
         
         }
        class CauThu{
            int SoAo;
            String Ten,Doi;
            
            void setTen(String name)
            {
                this.Ten=name;
            }
            void setDoi(String td)
            {
                this.Doi=td;
            }
            void setSoAo(int number)
            {
                this.SoAo=number;
            }
            String getTen()
            {
                return this.Ten;
            }
            String getDoi()
            {
                return this.Doi;
            }
            int getSoAo()
            {
                return this.SoAo;
            }
        } 
        
        public class Sach{
            int SoTrang,GiaTien;
            String Loai;
            void setSoTrang(int st)
            {
                this.SoTrang=st;
            }
            void setGiaTien(int gt)
            {
                this.GiaTien=gt;
            }
            void setLoai(String l)
            {
                this.Loai=l;
            }
            String getLoai()
            {
                return this.Loai;
            }
            int getGiaTien()
            {
                return this.GiaTien;
            }
            int getSoTrang()
            {
                return this.SoTrang;
            }
        }
        
         class Car{
            String Ten,Loai,MauSac;
            int GiaTien
            void Chay{
                    System.out.println("brum brum");
            }
            void setTen(String name)
            {
                this.Ten=name;
            }
            void setLoai(String loai)
            {
                this.Loai=loai;
            }
            void setMauSac(String colour)
            {
                this.MauSac=colour;
            }
            void setGiaTien(int price)
            {
                this.GiaTien=price;
            }
            String getTen()
            {
                return this.Ten;
            }
            String getLoai()
            {
                return this.Loai;
            }
            String getMauSac()
            {
                return this.MauSac;
            }
            int getGiaTien()
            {
                return this.GiaTien;
            }
        }