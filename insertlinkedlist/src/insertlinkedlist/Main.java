package insertlinkedlist;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list = list.insert(list,1);
		list.print(list);
		list = list.insert(list, 8);
		list.print(list);
		list.reversePrint(list);
		

	}

}
