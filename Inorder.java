//binary tree 
//O(n)

public class Inorder{

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
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

            //right tree
            newNode.right = buildTree(nodes);

            return newNode;
        }

        
        public static void inorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            //left
            inorder(root.left); // 1 2 3 4
            //root
            System.out.print(root.data+" "); // 1
            //right
            inorder(root.right); // 1
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println("Root "+ root.data);
        tree.inorder(root);
    }
}