//second smallest element in array   ***(method -2)***


public class SecondSMALLestMethod2{
public static void main(String x[]){

int []a={6,3,8,2,1,7};

int min=Integer.MIN_VALUE;
int smin=Integer.MIN_VALUE;

for(int i=0;i<a.length;i++)
  {
     if(min < a[i])
      {
        smin=min;
        min=a[i];
      }
       else if(a[i] < smin  && a[i]!=0)
            {
              smin=a[i];
            }
    }
    System.out.println("second smallest element is : "+smin);
  }
}