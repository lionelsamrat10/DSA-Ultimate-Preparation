//Function to find the minimum element in the given BST.
    int minValue(Node node)
    {
        Node current = node;
        //if(node == null) return node.data;
        while(current.left != null) current = current.left;
        return current.data;
    }
