/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package armstrong;

/**
 *
 * @author Venkatesh
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=370,n,temp,total=0;
        n=num;
        while(n!=0)
        {
            temp=n%10;
            total=total+temp*temp*temp;
            n/=10;
        }
        if(total==num)
            System.out.println(num+"is an armstrong number");
        else
            System.out.println(num+"is not an armstrong number");
        }
        // TODO code application logic here
    }
    

