//Move all zeros present in an array to the end

import java.util.*;
public class Exercise2
{
    public static void main(String[] args) {
        int a[]={1,0,2,5,0,6,0,8};
        int n=a.length;
        int b[]=new int[a.length];
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[count]=a[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
