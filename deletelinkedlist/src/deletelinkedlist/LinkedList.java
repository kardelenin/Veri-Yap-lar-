package deletelinkedlist;

public class LinkedList {

	Node root;
	
	public LinkedList delete(LinkedList list, int deletedNodeData)
	{
		if(list.root==null) {
			System.out.println("liste boş");
			return list;
		}
		
		if(list.root!=null && list.root.data==deletedNodeData)
		{
			list.root=list.root.next;
			return list;
		}
		
		Node iter= list.root;
		while(iter.next!=null&& iter.next.data!= deletedNodeData) //silinenden hemen önce durdu
			iter=iter.next;
		
		if(iter.next==null) //1. gerekçe sonucu
			System.out.println("sayı bulunamadı.");
		
		else //2. gerekçe sonucu
			iter.next=iter.next.next;
		
		return list;
		
		
		
		
	}
	
	public LinkedList insert(LinkedList list, int newData)
	{
		Node newNode = new Node(newData);
		
		if(list.root==null)
			list.root=newNode;
		
		else 
		{
			Node iter= list.root;
			
			while(iter.next!=null) {
			iter=iter.next;}
			
			iter.next=newNode;
		}
			
		return list;		
	}
	
	
	public void print(LinkedList list)
	{
		Node iter= list.root;
		while(iter!=null)
		{
			System.out.println(iter.data);
			iter=iter.next;
		}
		
	}
	
	
	
	
	
	
	
	
}
