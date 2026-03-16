//Q5. Write a java program to find positive and negative number in array.


public class PositiveNegaiveNumber{
public static void main(String x[]){

int a[]={6,9,3,-6,33,-87,-38};


System.out.println("Positive number in array=");
for(int i=0;i<a.length;i++)
{
           if(a[i]>0)
         {
           System.out.print(a[i]+" ");
          }
}
System.out.println(" ");

System.out.println("Negative number in array=");
for(int i=0;i<a.length;i++)
{
           if(a[i]<0)
         {
           System.out.print(a[i]+" ");
          }
}

}
}