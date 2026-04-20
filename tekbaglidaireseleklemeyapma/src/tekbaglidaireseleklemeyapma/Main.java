package tekbaglidaireseleklemeyapma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularListoneway list= new CircularListoneway();
		list = list.insert(list, 8);
		list = list.insert(list, 9);
		list.print(list);
		list= list.orderlyinsert(list, 6);
		list= list.orderlyinsert(list, 5);
		list.print(list);
		list= list.orderlyinsert(list, 1);
		list= list.orderlyinsert(list, 3);
		list= list.orderlyinsert(list, 7);
		list.print(list);
		list=list.delete(list, 6);
		list.print(list);
		list.reverse(list);
		list.print(list);
	}

}
