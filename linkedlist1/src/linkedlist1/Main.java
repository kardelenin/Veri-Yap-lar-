package linkedlist1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//linked listin aynısı sadece farkli yazilisi next.next demeyelim diye
		LinkedList list = new LinkedList();
		Node newNode = new Node(1);
		list.root= newNode;
		
		Node iter=list.root;
		newNode = new Node(2);
		iter.next=newNode;
		iter=iter.next;
		newNode= new Node(3);
		iter.next=newNode;
		iter=iter.next;
		
		iter=list.root;
		while(iter!=null)
		{
			System.out.println(iter.data);
			iter=iter.next;
		}
	}

}
