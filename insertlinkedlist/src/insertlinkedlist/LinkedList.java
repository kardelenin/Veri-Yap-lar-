package insertlinkedlist;

public class LinkedList {
	Node root;
	
	public LinkedList insert(LinkedList list, int data)
	{
		Node newNode = new Node(data);
		
		if(list.root ==null)
			list.root= newNode;
		else 
		{
			Node iter = list.root;
			while (iter.next != null)
				iter=iter.next; //sonuncuda durmuş oldum
			iter.next= newNode; // en sonuncudan sonra sonuncu ekledim
		}
		return list;
		
	}
	
	/*
	public void reversePrint(LinkedList list)
	{
		if(list.root==null)
		{
			System.out.print("Liste boş");
			return
		}
		
		Node iter = list.root.next;
		while(iter==list.root)
		{
			iter=iter.next;
			list.root=iter;
		}
		
		
		
		
		
		
	}
	*/
	//tek bağlı doğrusal bir listeyi sondan başa ekrana yazdıran method
	public void reversePrint (LinkedList list)
	{
		if(list.root==null)
			System.out.print("liste bos");
		else 
		{
			int sayac=0;
			Node iter = list.root;
			while(iter!=null)
			{
				sayac++;
				iter=iter.next;
			}
			
			int[] diz = new int[sayac];
			iter=list.root;
			int i=0;
			while(iter!=null)
			{
				diz[i]=iter.data;
				i++;
				iter=iter.next;
			}
			
			for(int j=sayac-1;j>=0;j--)
			{
				System.out.print(diz[j]+" ");
			}
			
			
		}
		
	}
	
	
	public void print(LinkedList list)
	{
		Node iter = list.root;
		
		System.out.println("LinkedList : ");
		
		while(iter != null) {
			System.out.print(iter.data + " ");
			iter=iter.next;
			
		}
		
	}

}
