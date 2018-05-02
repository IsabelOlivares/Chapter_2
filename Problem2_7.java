package ch2_LinkedLists;

public class Problem2_7 extends Problem2_3{
	boolean Palindrome(Node right){
		left= head;
		if(right==null)
			return true;
		boolean pal=Palindrome(right.next);
		if(pal==false)
			return false;
		boolean pal2=(right.data==(left).data);
		left=left.next;
		
	return pal2;
	}
	boolean isPalindrome(Node head){
		boolean res=Palindrome(head);
	return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem2_7 Llist = new Problem2_7();
		Llist.insert(0);
		Llist.insert(1);
		Llist.insert(2);
		Llist.insert(3);
		Llist.insert(2);
		Llist.insert(1);
		Llist.insert(0);
		/*Problem2_7 Llist2 = new Problem2_7();
		Llist2.insert(4);
		Llist2.insert(5);
		Llist2.insert(6);
		Llist2.insert(7);*/
		
		Llist.printList();
		System.out.println("");
		
		if(Llist.isPalindrome(head)!=false){
			System.out.println("is palindrome");
			System.out.println("");
		}else{
			System.out.println("Not Palindrome");
			System.out.println("");
		}
		/*Llist2.printList();
		System.out.println("");
		if(Llist2.isPalindrome(head)!=false){
			System.out.println("is palindrome");
			System.out.println("");
		}else{
			System.out.println("Not Palindrome");
			System.out.println("");
		}*/
		
	}

}
