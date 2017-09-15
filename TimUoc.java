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
       
        while(a!=b)
        {
            if(a>b) a=a-b;
             else 
                b=b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        int a=100;
        int b=100;
        System.out.println("Uoc chung lon nhat la :"+timuoc(a,b));
        
    }
   
}
