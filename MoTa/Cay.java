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
    public class Cay{
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
