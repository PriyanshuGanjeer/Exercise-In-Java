// Using Brute Force
// Find a pair with the given sum in an array
public class Exercise3
{
    public static void main(String[] args) {
        int a[]={1,3,4,6,2,8,0};
        int n =a.length;
        int target=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]+a[j]==10){
                    System.out.println("Pair Found " + a[i]+ ","+a[j]);
                }
            }
        }
        
            
        
        
    }
}
