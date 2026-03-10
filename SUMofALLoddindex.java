/* Problem: Sum elements at odd positions (1,3,5,…).
Example: [10, 20, 30, 40, 50] → 20+40 = 60 */



public class SUMofALLoddindex{
public static void main(String []x){

int []arr={10, 20, 30, 40, 50};
int sumofODDIND=0;


for(int i=1;i<arr.length;i+=2)
{  
       sumofODDIND=sumofODDIND + arr[i];
   }
 
  System.out.print(+sumofODDIND);
 
 }
}