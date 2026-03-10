//second largest element in array   ***(method -1)***

public class SecondLargest{
public static void main(String x[]){

int []a={7,2,5,3,9,4,10};

int temp;
for(int i=0;i<a.length;i++)
{
 for(int j=i+1;j<a.length;j++)
     { 
        if(a[i]<a[j])  // use greater than symbol (small > or ** large <)
          {
               temp=a[i];
                a[i]=a[j];
                a[j]=temp;
           }
       }
  }
    for(int i=0;i<a.length;i++)     // for sorting purpose use
     {
       System.out.print(a[i]+" ");
      }

   System.out.println("Second largest element: "+a[1]);   // put here which array index you have ..(i.e a[0],a[1],a[2],a[3],a[4])
 

 }
}