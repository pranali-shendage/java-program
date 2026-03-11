/* Problem: Find sum of first N elements of an array.
Example: [10, 20, 30, 40, 50], N=3 → 10+20+30 = 60   */


public class FirstnElement{
public static void main(String x[]){

int []arr={10, 20, 30, 40, 50};
int n=3;
int sum=0;

for(int i=0;i<n;i++)
 {
   sum +=arr[i];
  }
System.out.print("sum of first three element="+sum);
 
 }
}