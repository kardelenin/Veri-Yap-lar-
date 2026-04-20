package ciftbaglidogrusal;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list= new DoublyLinkedList();
		list = list.insert(list, 8);
		list = list.insert(list, 9);
		list.print(list);
		list= list.orderlyInsert(list, 6);
		list= list.orderlyInsert(list, 5);
		list.print(list);
		list= list.orderlyInsert(list, 6);
		list= list.orderlyInsert(list, 3);
		list= list.orderlyInsert(list, 8);
		list.print(list);
		list=list.delete(list, 6);
		list.print(list);
		list.reverseprint(list);
	}

}
