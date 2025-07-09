//we are using floyds Cycle Floyding Algorithm

// by using slow - fast pointers technique
//this algo states that after some time the slow and fast pointers come at the same place an when they do it means there exist a cycle
//cause in normal LL the S,F pointers would go on till they reach the null point, they wont be together anytime 

public class DetectCycleLL{
    public class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
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

    public boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next!= null)
        {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast)
            {
                return true; //cycle exist
            }
        }
        return false; //cycle doesnt exit
    }

    public void removeCycle()
    {
        //detect cycle
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                break;
            }
        }

        //find the meeting point
        slow = head;
        Node prev = null;
        while(slow != fast)
        {
            slow = slow.next;
        }
    }
    public static void main(String[] args)
    {
        DetectCycleLL ll = new DetectCycleLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(5);
        
        tail.next = head;
        // ll.print();
        System.out.println(ll.isCycle());
    }
}