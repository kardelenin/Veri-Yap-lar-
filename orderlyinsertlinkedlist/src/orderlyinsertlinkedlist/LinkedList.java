package orderlyinsertlinkedlist;

public class LinkedList {
 Node root;
 
 public LinkedList orderlyInsert(LinkedList list , int newData)
 {
	 Node newNode = new Node(newData);
	 
	 if(list.root==null) //bağlı liste boşsa
	 {
		 list.root= newNode;
		 return list;
		 
	 }
	 
	 //ilk eleman roottan küçük
	 if(newData<list.root.data)
	 {
		 //root değişiyor
		 newNode.next=list.root;
		 list.root=newNode;
		 
	 }
	 else {
		 Node iter = list.root;
		 while(iter.next!=null && iter.next.data<newData) //kendinden büyükten önce durcak çiz anlarsın
		 iter=iter.next;
		 
		 Node temp = iter.next; //önce dışı bağladım
		 iter.next=newNode; //sonra yeni düğümü bağladım
		 newNode.next=temp; //dışı ekledim
	 }
	 return list;
	 
	 
	 
 }
 
 public void print(LinkedList list) {
	 
	 Node iter=list.root;
	 
	 while(iter!=null) {
	 System.out.println(iter.data);
	 iter=iter.next;
	 }
 }
	
	
}
