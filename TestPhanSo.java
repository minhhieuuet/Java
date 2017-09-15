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
class PhanSo {
   int tu;
   int mau;
   PhanSo()
   {
       tu=1;
       mau=1;
   }
   PhanSo(int tu1,int mau1)
   {
       this.tu=tu1;
       this.mau=mau1;
   }
   
}
   public class TestPhanSo{
       static PhanSo Tong(PhanSo a,PhanSo b)
   {
       PhanSo phanso= new PhanSo();
       phanso.tu=a.tu*b.mau+b.tu*a.mau;
       phanso.mau=a.mau*b.mau;
       return phanso;
   }
   static PhanSo Hieu(PhanSo a,PhanSo b)
   {
       PhanSo phanso=new PhanSo();
       phanso.tu=a.tu*b.mau-b.tu*a.mau;
       phanso.mau=a.mau*b.mau;
       return phanso;
   }
   static PhanSo Tich(PhanSo a,PhanSo b)
   {
       PhanSo phanso=new PhanSo();
       phanso.tu=a.tu*b.tu;
       phanso.mau=a.mau*b.mau;
       return phanso;
   }
   static PhanSo Thuong(PhanSo a,PhanSo b)
   {
       PhanSo phanso=new PhanSo();
       phanso.tu=a.tu*b.mau;
       phanso.mau=a.mau*b.tu;
       return phanso;
   }
   static int UCLN(int a,int b)
   {
       while(a!=b)
       {
           if(a>b) a=a-b;
           else
              b=b-a;
       }
       return a;
   }
   static PhanSo ToiGian(PhanSo ps)
   {
       PhanSo phanso=new PhanSo();
       phanso.tu=(int)ps.tu/UCLN(Math.abs(ps.tu),Math.abs(ps.mau));
       phanso.mau=(int)ps.mau/UCLN(Math.abs(ps.tu),Math.abs(ps.mau));
       return phanso;
   }
    static boolean equals(PhanSo a,PhanSo b)
   {
       if(Thuong(a,b).mau==Thuong(a,b).tu)
       
           return true;
       
       else
           return false;
   }
   static void HienThi(PhanSo ps)
   {
       
       if(ps.tu==0) System.out.println(ps.tu);
       else
       
           System.out.println(ps.tu+"/"+ps.mau); 
       
   }
    public static void main(String[] args) {
        PhanSo phanso1=new PhanSo(5,10);
        PhanSo phanso2=new PhanSo(3,4);
        System.out.println("Phan so thu nhat:" +phanso1.tu+"/"+phanso1.mau);
        System.out.println("Phan so thu hai:"+phanso2.tu+"/"+phanso2.mau);
        System.out.println("Tong la:");
        HienThi(ToiGian(Tong(phanso1,phanso2)));
        
        System.out.println("Hieu la:");
        HienThi(ToiGian(Hieu(phanso1,phanso2)));
        
        System.out.println("Tich la:");
        HienThi(ToiGian(Tich(phanso1,phanso2)));
        
        System.out.println("Thuong la:");
        HienThi(ToiGian(Thuong(phanso1,phanso2)));
        
        if(equals(phanso1,phanso2))
        {
            System.out.println("Hai phan so bang nhau");
        }
        else
        {
            System.out.println("Hai phan so khac nhau");
        }
      
    }
    
}
