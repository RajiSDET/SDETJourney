package LinkedListLearning;

public class LLImplementation_with_Praga {

	ListNode head;
    int size;
    
	public void displayNodes() {

		ListNode currentNode = head;

		while (currentNode!= null) {
			System.out.print(currentNode.val + "->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
	
	public int getSize() {
		return size;
	}

	public void addNode(int data) {
		ListNode newNode = new ListNode(data);
		
		if (head == null) {
			head = newNode;
			
		} 
		
		else {
			ListNode currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		size++;
	}

	public static void main(String[] args) {
		LLImplementation_with_Praga obj = new LLImplementation_with_Praga();
		/*obj.addNode(66);
		obj.displayNodes();
		obj.addNode(99);
		obj.displayNodes();*/
		
		int[] input = new int[] {88,66,55,44,22};
		for (int i = 0; i < input.length; i++) {
			obj.addNode(input[i]);
		}
		obj.displayNodes();
		System.out.println(obj.getSize());
		
	}

}
