package LinkedList;

import org.w3c.dom.ls.LSInput;

class Demo1 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current!=null && current.next!=null)
        {
            if(current.data==current.next.data)
            {
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        int arr[] = {1,1,1,1};
        for(int i: arr)
        {
            ListNode node = new ListNode(i);
            temp.next = node;
            temp = temp.next;
        }

        Demo1.deleteDuplicates(head);

    }
}





































