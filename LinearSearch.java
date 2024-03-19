/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    // compare value at current array index to target value
    public static int search(int arr[], int x)
    {
        // O(n)
        int n = arr.length;

        for(int i = 0; i<n; i++)
        {
            if (arr[i] == x) {

                return i;
            }

        }
        // Todo 01: - complete the implementation of linear search and test your code  
        //         - provide asymptotic analysis of the developed solution
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 9, 8, 4, 5, 3, 12, 19};
        int result = search(arr, 5);
      System.out.println(result);

    }

}