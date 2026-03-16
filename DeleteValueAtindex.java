/* Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5 */


public class DeleteValueAtindex{
public static void main(String x[]){

int a[]={1,2,3,4,5,6};
int del=2;

for(int i=0;i<a.length;i++)
   {
     if(del==a[i])
      {
        for(int j=i;j<a.length-1;j++)
       {
         a[j]=a[j+1];
       }
       break;
     }
}



for(int i=0;i<a.length-1;i++)
{  
System.out.print(a[i]+" ");   
}


}
}