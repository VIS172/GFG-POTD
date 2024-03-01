class Solution
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
public int peakElement(int arr[], int n)
    {
       //edge case
        if (n == 1)
            return 0;
        int low = 0;
        int high = n - 1;
        
        // Perform binary search to find a peak element.
        while (low <= high) {
          int mid = (low + high)>>1;
          if ((mid == 0 || arr[mid-1] <= arr[mid]) &&(mid == n-1 || arr[mid+1] <= arr[mid]))
            return mid;
          else if(mid>0&&arr[mid-1]>arr[mid]){
              high = mid-1;
          } else{
              low = mid+1;
          }
        }
        return -1;
        
    }
}