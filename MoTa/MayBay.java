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
//Lớp máy bay
        public class MayBay{
            //Khởi tạo thuộc tính Ten và Loai
            private String Ten,Loai;
            //Khởi tạo thuộc tính SoKhach
            private int SoKhach;
            //Khởi tạo hàm Bay
            void Bay()
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
