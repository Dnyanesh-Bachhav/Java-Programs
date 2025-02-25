package LinkedList;


import java.util.LinkedList;

class AddTwoNumbers {
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        boolean isCarry = false;
        int sum = 0;
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(l1!=null&&l2!=null)
        {
            sum = l1.data + l2.data + sum;
            if(sum>9)
            {
                isCarry = true;
            }
            if(isCarry==true)
            {
                tail.next = new ListNode(sum%10);
                if(sum==10)
                {
                    sum = 1;
                }
                else{
                    sum = sum-10;
                }
            }else{
                tail.next = new ListNode(sum);
                sum = 0;
            }
            tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
            isCarry = false;
        }
        while(l1!=null)
        {
            sum = l1.data + sum;
            if(sum>9)
            {
                isCarry = true;
            }
            if(isCarry==true)
            {
                tail.next = new ListNode(0);
                sum = sum-10;
            }else{
                tail.next = new ListNode(sum);
                sum = 0;
            }
            tail = tail.next;
            l1 = l1.next;
            isCarry = false;
        }
        while(l2!=null)
        {
            sum = l2.data + sum;
            if(sum>9)
            {
                isCarry = true;
            }
            if(isCarry==true)
            {
                tail.next = new ListNode(0);
                sum = sum-10;
            }else{
                tail.next = new ListNode(sum);
                sum = 0;
            }
            tail = tail.next;
            l2 = l2.next;
            isCarry = false;
        }
        // head = reverse(head.next);
        return head.next;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
    }
}
