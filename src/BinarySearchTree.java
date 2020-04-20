class BinarySearchTree {//

    /* Class containing left and right child of current node and key value*/
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }
    void add(int key){
        Node current = root;
        while (current != null){
            
        }
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    int fingAvg(){
        return findAvgRec(root,1);
    }

    int findAvgRec(Node root, int count) {
        if (root == null) {
            return 0;
        }
        count++;
        return (root.key+findAvgRec(root.left, count)+findAvgRec(root.right, count))/count;
    }
    int findMax(){
        Node current = root;
        while (current.right != null)
            current = current.right;

        return (current.key);
    }

    int findMin(){
        Node current = root;
        while (current.left != null)
            current = current.left;

        return (current.key);
    }

    boolean isBST(){
        return  isBSTRec(root,root.key,root.key);
    }

    boolean isBSTRec(Node node, int max, int min){
        if (node == null)
            return true;
        if (node.key < min || node.key > max)
            return false;
        return (isBSTRec(node.left,node.key-1,min) && isBSTRec(node.right, max,node.key+1));
    }
}
