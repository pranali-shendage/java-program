//second largest element in array   ***(method -2)***


public class SecondLargestM2{
public static void main(String x[]){

int []a={6,3,8,2,1,7};

int max=Integer.MIN_VALUE;
int smax=Integer.MIN_VALUE;

for(int i=0;i<a.length;i++)
  {
     if(a[i] > max)
      {
        smax=max;
        max=a[i];
      }
       else if(a[i] > smax && a[i]!=0)
            {
              smax=a[i];
            }
    }
    System.out.println("second largest element is : "+smax);
  }
}