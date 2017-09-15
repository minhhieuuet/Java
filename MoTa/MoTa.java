dd/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

/**
 *
 * @author MINH HIEU
 */
//Khởi tạo class ConMeo
 
//Khởi tạo lớp GiaoVien
class GiaoVien
{
    //Khởi tạo thuộc tính tên và môn học
    private String Ten,MonHoc;
    //Khởi tạo thuộc tính tuổi
    private int Tuoi;
    //Khởi tạo hàm giangbai
    void giangbai()
    {
        System.out.println("Mot Hai Ba");
    }
    //Hàm set giá trị cho tên
    void setTen(String name)
    {
        this.Ten=name;
    }
    //Hàm set giá trị cho môn học
    void setMonHoc(String subject)
    {
        this.MonHoc=subject;
    }
    //Hàm set giá trị cho tuổi
    void setTuoi(int age)
    {
        this.Tuoi=age;
    }
    //Hàm lấy giá trị của Ten
    String getTen()
    {
        return this.Ten;
    }
    //hàm lấy giá trị của MonHoc
    String getMonHoc()
    {
        return this.MonHoc;
    }
    //Hàm lấy giá trị của Tuoi
    int getTuoi()
    {
        return this.Tuoi;
    }
}
//Lớp máy bay
        class MayBay{
            //Khởi tạo thuộc tính Ten và Loai
            private String Ten,Loai;
            //Khởi tạo đối tương SoKhach
            private int SoKhach;
            //Khởi tạo hàm Bay
            void Bay
            {
                System.out.println("u u u");
            }
            //Hàm set giá trị cho Ten
            void setTen(String name)
            {
                this.Ten=name;
            }
            //Hàm set giá trị cho Loai
            void setLoai(String type)
            {
                this.Loai=type;
            }
            //Hàm set giá trị cho SoKhach
            void setSoKhach (int sl)
            {
                this.SoKhach=sl;
            }
            //Hàm lấy giá trị của tên
            String getTen()
            {
                return this.Ten;
            }
            //Hàm lấy giá trị của Loai
            String getLoai()
            {
                return this.Loai;
            }
            //Hàm lấy giá trị của SoKhach
            int getSoKhach()
            {
                return this.SoKhach;
            }
                    
}
         //Khởi tạo lớp Cay
        class Cay{
            //Khởi tạo thuộc tính ChieuCao
            private float ChieuCao;
            //Khởi tạo thuộc tính Loai
            private String Loai;
            //Hàm set giá trị cho ChieuCao
            void setChieuCao(float height)
            {
                this.ChieuCao=height;
            }
            //Hàm set giá trị cho Loai
            void setLoai(String type)
            {
                this.Loai=type;
            }
            //Hàm lấy giá trị của chiều cao
           float getChieuCao ()
            {
                return this.ChieuCao;
            }             
           //Hàm get giá trị của Loai
           String getLoai()
           {
                return this.Loai;
           }
 }
        //Khởi tạo lớp SinhVien
         class SinhVien{
         //Khởi tạo thuộc tính Ten, MSSV,Khoa kiểu String
             private String Ten,MSSV,Khoa;
             //Khởi tạo hàm study
             void study()
             {
             
             }
             //Hàm set giá trị cho ten
             void setTen(String name)
             {
                 this.Ten=name;
             }
             //Hàm set giá trị cho MSSV
             void setMSSV(String MS)
             {
                 this.MSSV=MS;
             }
             //Hàm set giá trị cho Khoa
             void setKhoa(String n)
             {
                 this.Khoa=n;
             }
             //Hàm lấy giá trị của Ten
             String getTen()
             {
                 return this.Ten;
             }
             //Hàm lấy giá trị của MSSV
             String getMSSV()
             {
                 return this.MSSV;
             }
             //Hàm lấy giá trị của Khoa
             String getKhoa()
             {
                 return this.Khoa;
             }
         
         
         }
         //Khởi tạo lớp CauThu
        class CauThu{
            //Khởi tạo thuộc tính SoAo kiểu int
            int SoAo;
            //Khởi tạo thuộc tính Ten,Doi kiểu String
            String Ten,Doi;
            //Hàm set giá trị cho Ten
            void setTen(String name)
            {
                this.Ten=name;
            }
            //Hàm set giá trị cho Doi
            void setDoi(String td)
            {
                this.Doi=td;
            }
            //Ham set gia tri cho SoAo
            void setSoAo(int number)
            {
                this.SoAo=number;
            }
            //Hàm lấy giá trị của Ten
            String getTen()
            {
                return this.Ten;
            }
            //Hàm lấy giá trị của thuộc tính Doi
            String getDoi()
            {
                return this.Doi;
            }
            //Ham lấy giá trị của SoAo
            int getSoAo()
            {
                return this.SoAo;
            }
        } 
        //Khởi tạo lớp Sach
        class Sach{
            //Khởi tạo đổi tượng SoTrang,GiaTien
            int SoTrang,GiaTien;
            //Khởi tạo thuộc tính Loai kiểu String
            String Loai;
            //Hàm set giá trị cho SoTrang
            void setSoTrang(int st)
            {
                this.SoTrang=st;
            }
            //hàm set giá trị cho GiaTien
            void setGiaTien(int gt)
            {
                this.GiaTien=gt;
            }
            //Hàm set giá trị cho Loai
            void setLoai(String l)
            {
                this.Loai=l;
            }
            //Hàm lấy giá trị Loai
            String getLoai()
            {
                return this.Loai;
            }
            //Hàm lấy giá trị của GiaTien
            int getGiaTien()
            {
                return this.GiaTien;
            }
            //Hàm lấy giá trị của SoTrang
            int getSoTrang()
            {
                return this.SoTrang;
            }
        }
        //Khởi tạo lớp Car
         class Car{
             //Khởi tạo thuộc tính Ten,Loai,MauSac kiểu String
            String Ten,Loai,MauSac;
            //Khởi tạo đổi tượng GiaTien kiểu int
            int GiaTien
            //Khởi tạo hàm Chay
            void Chay{
                    System.out.println("brum brum");
            }
            //Hàm set giá trị cho Ten
            void setTen(String name)
            {
                this.Ten=name;
            }
            //Hàm set giá trị cho Loai
            void setLoai(String loai)
            {
                this.Loai=loai;
            }
            //Hàm set giấ trị cho MauSac 
            void setMauSac(String colour)
            {
                this.MauSac=colour;
            }
            //Hàm set giá trị cho GiáTien
            void setGiaTien(int price)
            {
                this.GiaTien=price;
            }
            //Hàm lấy giá trị Ten
            String getTen()
            {
                return this.Ten;
            }
            //Hàm lấy giá trị Loai
            String getLoai()
            {
                return this.Loai;
            }
            //Hàm lấy giá trị MauSac
            String getMauSac()
            {
                return this.MauSac;
            }
            //Hàm lấy giá trị GiaTien
            int getGiaTien()
            {
                return this.GiaTien;
            }
        }

       
