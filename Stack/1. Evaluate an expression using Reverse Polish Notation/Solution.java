// T(n) = O(|tokens|)
// S(n) = O(|tokens|)
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>(); 
        
        for(String token: tokens){
            //If token is an operator
            if(isOperator(token)){
                //pop the top two elements from the stack
                //perform the specified operation
                int operand1 = Integer.parseInt(stack.pop());
                int operand2 = Integer.parseInt(stack.pop());
                
                int ans = 0;
                
                if(token.equals("+")){
                    ans = operand1 + operand2;
                } else if(token.equals("-")){
                    ans = operand2 - operand1;
                } else if(token.equals("*")){
                    ans = operand1 * operand2;
                } else if(token.equals("/")){
                    ans = operand2 / operand1;
                }
                //push the result onto the stack
                stack.push(ans+"");
                
            }else{
                //if token is an operand
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());
    }
    //Function to check whether the element is an operator or not
    public static boolean isOperator(String token){
        if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
            return true;
        }
        return false;
    }
}
