/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2.MoTa;

/**
 *
 * @author MINH HIEU
 */
 public class ConMeo {
     //Khởi tạo thuộc tính cân nặng
    private float CanNang;
    //Khởi tạo thuộc tính tên và loại mèo
    private String Ten,Loai;
    //Hàm kêu
    void keu(){
        System.out.println("Meo meo");
    };
    //Hàm set giá trị cho Cân nặng
     void setCanNang(float weight)
            {
                this.CanNang=weight;
                
            }
     //Hàm set giá trị cho Tên
    void setTen(String name)
            {
                this.Ten=name;
                
            }
    //Hàm set giá trị cho loại
    void setLoai(String type)
            {
                this.Loai=type;
                
            }
    //Hàm lấy giá trị cân nặng
    float getCanNang()
    {
        return this.CanNang;
    }
    //Hàm lấy tên
    String getTen()
    {
        return this.Ten;
    }
    //Hàm lấy thể loại
    String getLoai()
    {
        return this.Loai;
    }
     public static void main(String[] args) {
         
     }
}

