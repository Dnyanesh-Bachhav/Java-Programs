package LinkedList;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data = data;
    }
}

public class CountNodes {

    static void printList(ListNode head)
    {
        ListNode temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode first = new ListNode(20);
        ListNode second = new ListNode(30);
        ListNode third = new ListNode(40);
        ListNode fourth = new ListNode(50);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        printList(head);

    }
}
