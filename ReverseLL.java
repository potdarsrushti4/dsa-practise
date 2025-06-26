public class ReverseLL{
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

    //reverse step
    //3 variables => prev,curr,next 4 steps


    public void revers()
    {
        Node prev =null;
        Node curr =head;
        Node next;
        
        while(curr != null)
        {
            //1. next ko initalize kro
            next = curr.next;
            //2. curr ko piche connect kro 
            curr.next = prev; //reversing step
            //move prev and curr age
            prev = curr; //jaha curr point kara woh prev ban jaye
            curr = next; //jaha next point kra woh curr ban jaye 
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.revers();
        ll.print();
    }
}