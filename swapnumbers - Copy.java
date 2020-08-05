/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java1;


public class swapnumbers {

   
    public static void main(String[] arg){
        int a=12,b=30;
        System.out.println("before swap");
        System.out.println("first number="+a);
        System.out.println("second number="+b);
        a=a-b;
        b=a+b;
        a=b-a;
        
        System.out.println("after swapping");
        System.out.println("first number="+a);
        System.out.println("second number="+b);
        
    }
    
}
