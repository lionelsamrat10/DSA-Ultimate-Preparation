class Solution {
    //Function to rearrange the array with negative elements, moved at the beginning of the array
    public static void rearrange(int[] arr, int n){
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                if(i != j){
                    swap(arr, i, j);
                }
                j++;
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
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
 
        rearrange(arr, n);
        printArray(arr, n);
    }
}
