/*Problem: Sum last N elements.
Example: [10, 20, 30, 40, 50], N=2 → 40+50 = 90
*/

public class SUMofLASTn{
public static void main(String x[]){

int []arr={10,20,30,40,50};
int n=2;
int sum=0;

for(int i=arr.length-n;i<arr.length;i++)
{ 
  sum +=arr[i];
  
}

System.out.println("sum of last 2 elements="+sum);
 }
}

