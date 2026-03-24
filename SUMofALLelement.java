/* Problem: Find the sum of all elements in the array.
   Example: [10, 20, 30, 40] → Sum = 100  */

public class SUMofALLelement{
public static void main(String x[]){

int []arr={10,20,30,40};
int sum=0;

System.out.println("sum of all elements:");
for(int i=0;i<arr.length;i++)
{
   sum +=arr[i];
}
System.out.print(sum+" ");

 }
}
