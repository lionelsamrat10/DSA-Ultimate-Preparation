class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> solution = new ArrayList<>();
        
        if(node == null) return solution;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=1; i<=n; i++){
                Node temp = queue.poll();
                if(i == n) solution.add(temp.data);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
        
        return solution;
    }
}
