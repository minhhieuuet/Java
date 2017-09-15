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
public class Car{
             //Khởi tạo thuộc tính Ten,Loai,MauSac kiểu String
            String Ten,Loai,MauSac;
            //Khởi tạo đổi tượng GiaTien kiểu int
            int GiaTien;
            //Khởi tạo hàm Chay
            void Chay(){
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
