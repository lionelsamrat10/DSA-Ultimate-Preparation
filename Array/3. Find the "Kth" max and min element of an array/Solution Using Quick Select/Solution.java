// O(n) Average Case
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //if k is lesser than number of elements in the array
        if(k > 0 && k <= r - l + 1){
            //Partition the array around the last element and get the position of the pivot element in the sorted array
            int pIndex = partition(arr, l, r);
            
            //If the position is same as k
            if(pIndex - l == k - 1){
                return arr[pIndex];
            }
            //If position is more, then recur the left subarray
            if(pIndex - l > k - 1){
                return kthSmallest(arr, l, pIndex - 1, k);
            }
            //Else recur on the right subarrat
            return kthSmallest(arr, pIndex + 1, r, k - pIndex + l - 1);
        }
        //If k is more than number of elements in the array
        return Integer.MAX_VALUE;
    }
    //Logic to find the position of the selected pivot element
    public static int partition(int[] arr, int l, int r){
        int pIndex = arr[r];
        int i = l;
        
        for(int j = l; j <= r-1; j++){
            if(arr[j] <= pIndex){
                swap(arr, i, j);
                i++;
            }
        }
        //Swap arr[i] and arr[r]
        swap(arr, i, r);
        //return the correct position of the pivot
        return i;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
