class Solution {
    //Function to rearrange the array with negative elements, moved at the beginning of the array
    public static void rearrange(int[] arr, int left, int right){
        while(left <= right){
            //if left and right elements points to the negative elements
            if(arr[left] < 0 && arr[right] < 0){
                left++;
            } else if(arr[left] > 0 && arr[right] < 0){
                swap(arr, left, right);
            } else if(arr[left] > 0 && arr[right] > 0){
                right--;
            } else{
                left++;
                right--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // A utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { -12, 11, -13, -5,
                   6, -7, 5, -3, 11 };
        int n = arr.length;
 
        rearrange(arr, 0, n-1);
        printArray(arr, n);
    }
}
