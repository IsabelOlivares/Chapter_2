package ch2_LinkedLists;

public class Problem2_5 extends Problem2_3{
	 Node addTwoLists(Node first, Node second) {
	        Node res = null; // res is head node of the resultant list
	        Node prev = null;
	        Node temp = null;
	        int carry = 0, sum;
	 
	        while (first != null || second != null) 
	        {
	        
	            sum = carry + (first != null ? first.data : 0)
	                    + (second != null ? second.data : 0);
	 
	            carry = (sum >= 10) ? 1 : 0;

	            sum = sum % 10;

	            temp = new Node(sum);

	            if (res == null) {
	                res = temp;
	            } else 
	            {
	                prev.next = temp;
	            }

	            prev = temp;

	            if (first != null) {
	                first = first.next;
	            }
	            if (second != null) {
	                second = second.next;
	            }
	        }
	 
	        if (carry > 0) {
	            temp.next = new Node(carry);
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem2_5 list=new Problem2_5();
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);
        System.out.print("1st List-> ");
        list.printList(head1);
 
        // creating seconnd list
        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        System.out.print("2nd List-> ");
        list.printList(head2);
 
        // add the two lists and see the result
        Node rs = list.addTwoLists(head1, head2);
        System.out.print("Final List-> ");
        list.printList(rs);
	}

}
