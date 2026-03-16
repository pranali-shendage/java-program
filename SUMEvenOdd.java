//Q8. Write a java program to calculate the sum of even or odd numbers.

public class SUMEvenOdd{
public static void main(String x[]){

int a[]={34,87,56,74,21,86,59};
int sum=0;

System.out.println("Even number");

for(int i=0;i<a.length;i++)
  {
        if(a[i]%2==0)
        {
          sum=sum + a[i];
         }
          
}  System.out.print("sum="+sum);  


 System.out.println(" ");

System.out.println("odd number");

for(int i=0;i<a.length;i++)
  {
        if(a[i]%2!=0)
        {
          sum=sum + a[i];
        }
  }  
    System.out.print("sum="+sum);  

}
}