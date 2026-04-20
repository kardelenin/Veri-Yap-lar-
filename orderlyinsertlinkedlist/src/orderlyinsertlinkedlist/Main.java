package orderlyinsertlinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list= new LinkedList();
		list= list.orderlyInsert(list, 9);
		list= list.orderlyInsert(list, 2);
		list= list.orderlyInsert(list, 6);
		list.print(list);

	}

}
