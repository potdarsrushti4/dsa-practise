public class LinkedList{
    public static class Node{
        int data ;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size; //O(1) since u created a static variable u dont have to loop through objects and count
     //add first node //O(1)
    public void addFirst(int data)
    {
        //step 1 : create a new node
        Node newNode = new Node(data);
        size++;
        //when list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //this are the steps when we have 1 or many elements
        
        //step 2: newNode next = old head
        newNode.next = head; //head

        //step 3: head = newNode
        head = newNode;
    }

    //add last //O(1)
    public void addLast(int data)
    {
        //Step 1 : create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        //step 2 : tail ka next = newNode
        tail.next = newNode;

        //step 3: tail = newNode
        tail =  newNode;
    }

    //print thw LL
    public void print(){
        if(head == null)
        {
            System.out.println("Linked LIST is empty");
            return;
        }
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    //add in the middle
    //O(n)->as we have to traverse through the whole list to find the index
    //O(1)-> to add the node

    public void addMiddle(int index,int data)
    {
        //if list is empty
        if(index==0)
        {
            addFirst(data);
            return;
        }
        //here i have to traverse fromthe head always
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while( i != index-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //remove first
    //the garbage collector removes the first element(head) automatically as nothing is pointing towards it
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("Linekd lis t is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("LL is empty!!");
            return 0;
        }
        else if(size==1)
        {
            int val = head.data;
            head = tail = null;
            return val;
        }
        
        //prev : i = size-1;
        Node prev = head;

        for(int i = 0 ; i<size-2 ; i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail =prev;
        size--;
        return val;
    }
    //iterative search
    public int search(int key )
    {
        Node temp = head;
        int i=0;

        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found;
        return -1;
    }

    //reverse classical ques
    public void reverse()
    {
        //IN this there are always 3 variables and 4 steps
        Node prev = null;
        Node curr = tail = head;
        Node next; //cause next age steps mai intialize hoga
        // System.out.println(curr.next); 
        while(curr != null)
        {

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        head = prev; //last mai curr null hota mtlb uske pahele wla prev head banega
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // ll.head = new Node(5);
        // ll.head.next = new Node(6);
        ll.print();
        ll.addFirst(6);
        // ll.print();
        ll.addFirst(5);
        // ll.print();
        ll.addLast(7);
        ll.addLast(8);
        ll.print();
        // System.out.println(head.data);
        // ll.addMiddle(2, 9);
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.removeFirst());
        // ll.print();

        // System.out.println(ll.removeLast());
        // ll.print();

        // System.out.println(ll.search(7));
        // System.out.println(ll.search(99));

        ll.reverse();
        ll.print();
    }
}