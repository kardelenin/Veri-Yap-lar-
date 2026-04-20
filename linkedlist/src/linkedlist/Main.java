package linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		Node newNode = new Node(5);
		list.root=newNode;
		newNode= new Node(50);
		list.root.next= newNode;
		newNode = new Node(150);
		list.root.next.next= newNode;
		
		Node iter = list.root;
		while (iter!=null)
		{
			System.out.println(iter.data);
			iter=iter.next;
		}
		
		

	}

}
