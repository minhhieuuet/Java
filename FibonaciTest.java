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

 public class FibonaciTest{
      public static long fibonaxi(int n)
    {
        if(n<=1) return n;
        else
            return fibonaxi(n-1)+fibonaxi(n-2);
    }
     public static void main(String[] args) {
        int n=10;
        System.out.println(fibonaxi(n));
    }
}
