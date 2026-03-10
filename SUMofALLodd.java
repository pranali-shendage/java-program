/*Problem: Find the sum of all odd elements.
Example: [1, 2, 3, 4, 5] → Sum of odd = 1+3+5 = 9 */


public class SUMofALLodd{
public static void main(String []x){

int []arr={1, 2, 3, 4, 5};
int sumofodd=0;


for(int i=0;i<arr.length;i++)
{  
   if(arr[i]%2!=0)
    {
     sumofodd=sumofodd + arr[i];
    }
}
 
  System.out.print(+sumofodd);
 
 }
}