public class Postorder{
    //create a node
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int[] nodes)
        {
            index++;
            if(nodes[index] == -1)
            {
                return null;
            }
            //create a node
            Node newNode = new Node(nodes[index]);

            //build left tree 
            newNode.left = buildTree(nodes);

            //build right tree
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void postOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        //left
        postOrder(root.left);
        //right
        postOrder(root.right);
        //root
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        postOrder(root);
    }
}