//find k th smallest  element in array.



public class kthsmallest{
public static void main(String x[]){

int []a={8,5,3,7,9,2,4};
int k=5;int temp;

for(int i=0;i<a.length;i++)
  {
    for(int j=i+1;j<a.length;j++)
      {
        if(a[i] > a[j])
         {
            temp=a[i];
             a[i]=a[j];
              a[j]=temp;
          }
      }
     if(i==k-1)
      {
        System.out.println(k+"smallest element is: "+a[i]);
        break;
      }
   }
  for(int i=0;i<a.length;i++)
   {
     System.out.print(" "+a[i]);
    }

 }
}