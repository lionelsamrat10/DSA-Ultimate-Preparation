class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        ArrayList<Integer> solution = new ArrayList<>();
        // Take a Stack
        Stack<Node> stack = new Stack<>();
        // Take a Queue
        Queue<Node> queue = new LinkedList<>();
        
        if(root == null) return new ArrayList<>();
        // Add the root onto the queue
        queue.add(root);
        
        while(!queue.isEmpty()){
            /* Dequeue node and make it root */
            root = queue.peek();
            queue.remove();
            stack.push(root);
            /* Enqueue right child */
            // NOTE: RIGHT CHILD IS ENQUEUED BEFORE LEFT
            if(root.right != null) queue.add(root.right);
            /* Enqueue left child */
            if(root.left != null) queue.add(root.left);
        }
        // Now pop all the items from the stack one by one and add onto solution list
        while(!stack.empty()){
            root = stack.peek();
            solution.add(root.data);
            stack.pop();
        }
        return solution;
    }
}      
