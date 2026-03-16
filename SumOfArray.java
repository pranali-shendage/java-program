//Q2. Write a java program to calculate sum of array is size 5.


public class SumOfArray{
public static void main(String x[]){

int a[]={2,3,4,5,6,7,8,1};

int sum=0;

for(int i=0;i<a.length;i++)
{
sum=sum + a[i];
//System.out.println("sum of array="+a[i]);


}
System.out.print("sum of array="+sum);

}
}