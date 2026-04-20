package deletelinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		
		list.delete(list, 45);
		list.print(list);
		list= list.insert(list, 8);
		list= list.insert(list, 5);
		list= list.insert(list, 18);
		list= list.insert(list, 75);
		list.print(list);
		list.delete(list, 18);
		list.print(list);
	}

}
