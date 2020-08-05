/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diviby7;

/**
 *
 * @author Venkatesh
 */
public class Diviby7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0,n=100,temp;
        while(n<=200)
        {
            temp=n%7;
            if(temp==0)
            {
                sum=sum+n;
            }
            n++;
        }
        System.out.println("sum of all integers divisible by 7 between 100 and 200 is:"+sum);
            
            }
        }
    
    

