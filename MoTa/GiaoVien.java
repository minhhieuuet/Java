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
public class GiaoVien
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
