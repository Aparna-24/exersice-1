/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch;

public class Switch {
    
public static void main(String[] args) {
    
int marks = Integer.parseInt(args[0]);

switch(marks/10)
{
case 10: 
System.out.println("excellent");
break;
case 9:
case 8:    
System.out.println("very good");
break;
case 7:
case 6:    
System.out.println("good");
break;
case 5:
case 4:
case 3:    
System.out.println("poor");
break;
case 2:
case 1:
case 0:
System.out.println("very poor");
break;
default:
System.out.println("invalid value entry");
}
}
}

    
    

