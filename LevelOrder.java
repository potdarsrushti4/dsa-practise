//binary tree
//level order traversal
import java.util.LinkedList;
import java.util.Queue;
public class LevelOrder{
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
        int index = -1;
        public Node buildTree(int[] nodes){
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

    public static void levelOrder(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node currNode = q.remove();
            if(currNode == null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    System.out.println();
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right != null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree t = new BinaryTree();
        Node root = t.buildTree(nodes);
        levelOrder(root);
    }
}