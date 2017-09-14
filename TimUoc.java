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
public class TimUoc {
    public static int timuoc(int a,int b)
    {
        int uc=0;
        for(int i=b;i>0;i--)
        {
            if(a%i==0&&b%i==0)
            {
                uc=i;
                break;
            }
        }
        return uc;
    }
    public static void main(String[] args) {
        int a=20;
        int b=10;
        System.out.println("Uoc chung lon nhat la :"+timuoc(a,b));
    }
    
}
