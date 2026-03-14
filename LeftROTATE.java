/* Rotate array

 Code: Problem: Shift all elements to the left by 1; the first element moves to the end.
Example: [10, 20, 30, 40, 50] → [20, 30, 40, 50 ,10]   */


public class LeftROTATE{
public static void main(String []x){

int []arr={10, 20, 30, 40, 50};
int n=arr.length;
int first=arr[0];

for(int i=0;i<n-1;i++)
{
  arr[i]=arr[i+1];
}

arr[n-1]=first;


for(int i=0;i<n;i++)
{
  System.out.print(arr[i]+" ");
}

 }
}