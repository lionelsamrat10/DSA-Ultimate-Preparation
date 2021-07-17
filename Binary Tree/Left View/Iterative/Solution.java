class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> solution = new ArrayList<>();
      
      if (root == null) return solution;
      
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      
      while(!queue.isEmpty()){
          // Number of nodes at current level
          int n = queue.size();
          // Traverse all the nodes in the current level
          for(int i=1; i<=n; i++){
              Node temp = queue.poll();
              // Add the first node of the current level on the solution list
              if(i == 1) solution.add(temp.data);
              
              // Add the left node to the queue
              if(temp.left != null) queue.add(temp.left);
              // Add the right node to the queue
              if(temp.right != null) queue.add(temp.right);
          }
      }
      return solution;
    }
}
