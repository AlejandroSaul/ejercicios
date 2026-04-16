package main;

public class main {

	public static void main(String[] args) {
		AddTwoNumbers funcion = new AddTwoNumbers();
		/*
		ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
		ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
		*/
		
		
		
		
		ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(9)));
		ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4,new ListNode(9))));
		/*
		
		ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,
				new ListNode(9,new ListNode(9,new ListNode(9)))))));
		ListNode l2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))));
		/*
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1,new ListNode(9,new ListNode(9,new ListNode(9,
				new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))));
*/
		funcion.imprimirNode(funcion.addTwoNumbers(l1, l2));
	}

}
