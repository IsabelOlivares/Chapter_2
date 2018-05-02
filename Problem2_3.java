package ch2_LinkedLists;


/*Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node*/
public class Problem2_3 {
	static Node head;
	static Node left;
	static Node head1;
	static Node head2;
	
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}	
	}
	public void insert(int new_data){
		Node new_Node= new Node(new_data);
		new_Node.next=head;
		head=new_Node;  
	}
	public void printList(){
		Node tNode=head;
		while(tNode!=null){
			System.out.print(tNode.data+" ");
			tNode=tNode.next;
		}
	}
	public void printList(Node head){
		while(head !=null){
			System.out.print(head.data + " ");
			head=head.next;
		} 
		System.out.println("");
	}
	public void deleteNode(Node n){
		Node temp= n.next;
		n.data=temp.data;
		n.next=temp.next;
		temp=null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem2_3 Llist = new Problem2_3();
		Llist.insert(1);
		Llist.insert(2);
		Llist.insert(3);
		Llist.insert(4);
		Llist.insert(5);
		
		System.out.println("Before");
		Llist.printList();
		System.out.println("\nAfter");
		Llist.deleteNode(head.next.next); //How to pass parameter node using data value???
		Llist.printList();
	}
		
}
