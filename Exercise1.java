
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.Scanner; 
import java.util.*;

public class Exercise1
{
    public static void main(String[] args) {
         
         
         int sum=0;
         int i;
         int first,last;
         int j=0;
         int x;
         System.out.println("Please Enter first Range value");
         Scanner rf=new Scanner(System.in);
         first=rf.nextInt();
         System.out.println(" Please Enter last Range Value");
         last=rf.nextInt();
         System.out.println("Please Enter Number by Which want to you divide");
         x=rf.nextInt();
         
         if(first<last){
          for(i=first;i<last;i++){
             if(i%x==0){
                 
                 sum=sum+i;
                 j++;
                 
             }
         }
System.out.println("----------------------------------------------------------------------------------");    
System.out.println("The sum of number between "+ ""+first +"" +" to " + last +  " which is divisible by " + x + ""+" is = "+sum);
 
System.out.println("----------------------------------------------------------------------------------");

System.out.println("Total Number between " + first + "" + " to " + last + "  which is divisible by " + x + " is = "+j);
         }
         else{
             System.out.println("First Range Value is Must be smaller than last range value  First Range < Last Range ");
         }
    }
    
}
