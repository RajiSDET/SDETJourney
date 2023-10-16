package LinkedListLearning;

	public class ListNode {
		
		int val;
		ListNode next;
		
		//default constructor
		ListNode() {
		}
		
		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
}
