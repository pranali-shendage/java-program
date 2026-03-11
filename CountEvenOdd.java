/*6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3
*/

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int even = 0, odd = 0;

        for(int num : arr) {
            if(num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}