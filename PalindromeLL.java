public class PalindromeLL{
    public class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data =data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //step 1: find mid
    //find mid using slow-fast technique
    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;      //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    // palindrome function
    public boolean checkPalindrome()
    {
        if(head==null || head.next == null)
        {
            return true;
        }   
        // Step 1 : find the mid
        Node midNode = findMid(head);
        //Step 2 : reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next;
        }
        //step 3 : check left half and second half
        Node left = head;
        Node right = prev;

        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLL ll = new PalindromeLL();
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addLast(4);
        ll.print();

        Boolean result = ll.checkPalindrome();
        
        ll.print();
        System.out.println(result == true ? "yes it is palindrome" : "no");
    }
}