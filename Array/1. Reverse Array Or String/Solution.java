// Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-string/1#

// Iterative Approach O(|S|) where S is the Length of the String
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        //Converting the String to character array
        char[] stringToCharArray = str.toCharArray();
        int start = 0, end = str.length() - 1;
        while(start < end){
            char temp = stringToCharArray[start];
            stringToCharArray[start] = stringToCharArray[end];
            stringToCharArray[end] = temp;
            start++;
            end--;
        }
        //Converting the Character Array to String again
        return String.valueOf(stringToCharArray);
    }
}

//Recursive Approach
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int start = 0, end = str.length() - 1;
        String strAns = reverseWordRec(str, start, end);
        return strAns;
    }
    public static String reverseWordRec(String str, int start, int end){
        //Converting the String to character array
        char[] stringToCharArray = str.toCharArray();
        if(start >= end){
            //Converting the Character Array to String again
            return String.valueOf(stringToCharArray);
        }
        char temp = stringToCharArray[start];
        stringToCharArray[start] = stringToCharArray[end];
        stringToCharArray[end] = temp;
        return reverseWordRec(String.valueOf(stringToCharArray), start+1, end-1);
    }
}
