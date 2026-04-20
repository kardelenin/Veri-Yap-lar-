package ciftbaglidogrusal;

public class DoublyLinkedList {
 Node root;
 
 public DoublyLinkedList insert(DoublyLinkedList list, int data)
 {
	 Node newNode= new Node(data);
	 
	 if(list.root==null) {
		 list.root=newNode;}
	 else
	 {
		 Node iter = list.root;
		 while(iter.next!=null)
			 iter=iter.next;
		 iter.next=newNode;
		 newNode.prev=iter;
		 
	 }
	 return list;
	 
	 
 }
 
 public void print(DoublyLinkedList list)
 {
	 if(list.root==null) {
		 System.out.print("liste bos");
		 return;
	 
	 }
	 Node iter=list.root;
	
	 System.out.print("Linked list : ");
	 
	 while(iter!=null)
	 {
		 System.out.print(iter.data+" ");
		 iter=iter.next;
	 }
	 
	 
 }
 
 // Çift bağlı dairesel için çalışmaz burda yeni aç bak
 public void reverseprint (DoublyLinkedList list)
 {
	 if (list.root==null)
	 {
		 System.out.print("liste bos");
		 return;
	 }
		 
	 Node iter=list.root.prev;
	
	 while(iter!= list.root)
	 {
		 System.out.print(iter.data+" ");
		 iter=iter.prev;
		 
	 }
	 System.out.print(iter.data+" ");
	 
	 
	 
 }
 
 
 public DoublyLinkedList orderlyInsert(DoublyLinkedList list, int newData)
 {
	 Node newNode= new Node(newData);
	 
	 if(list.root==null)
		 list.root=newNode;
	 
	 else if(newData<list.root.data)//ilk eleman roottan küçük
	 {
		 newNode.next=list.root;
		 newNode.prev=null;//yazmasakta olurda dairesl olmadığı belli 
		 
		 list.root.prev=newNode;
		 list.root=newNode;
	 }
	 else
	 {
		 Node iter=list.root;
		 while(iter.next!=null&&iter.next.data<newData)
			 iter=iter.next;
		 Node temp = iter.next;
		 iter.next=newNode;
		 newNode.next=temp;
		 newNode.prev=iter;
		 
		 if(temp!=null)
			 temp.prev=newNode;
	 }
	 return list;
	 
	 
 } 
 
 public DoublyLinkedList delete(DoublyLinkedList list, int deletedNodeData)
 {
	 if(list.root!=null&&list.root.data==deletedNodeData)
	 {
		 list.root=list.root.next;
		 return list;
	 }
	 
	 Node iter=list.root;
	 while(iter.next!=null&&iter.next.data!=deletedNodeData)
		 iter=iter.next;
	 
	 if(iter.next==null)
		 System.out.println("sayı bulunamadı");
	 else
		 iter.next=iter.next.next;
	 if (iter.next!=null)
		 iter.next.prev=iter;
	 return list;
	 
	 
	 
 } 
 
 
 
 

	
}
