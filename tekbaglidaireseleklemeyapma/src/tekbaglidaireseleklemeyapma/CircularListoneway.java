package tekbaglidaireseleklemeyapma;

public class CircularListoneway {
Node root;

public CircularListoneway insert(CircularListoneway list , int data)
{
	Node newNode = new Node(data);
	
	if(list.root==null)
	{
		list.root=newNode;
		list.root.next=list.root; //kendisini gösteriyor dairesel çünkü
	}
	else
	{
		Node iter= list.root;
		while(iter.next !=list.root)
			iter =iter.next;
		iter.next=newNode;
		newNode.next=list.root;
	}
	return list;
	
}

//tek bağlı dairesel listenin elemanlarını tersine çeviren method
public void reverse(CircularListoneway list)
{
	if(list.root==null)
		System.out.print("liste bos");
	else
	{
		Node prev=null;
		Node current=list.root;
		Node nextNode=null;
		
		do{
			nextNode=current.next;
			current.next=prev;
			prev=current;
			current=nextNode;
			
		}while(current!=list.root && current != null);
			
			
			list.root.next=prev;
		list.root=prev;
		
		
		
		
		
		
		
	}
	
}








public void print (CircularListoneway list)
{
	Node iter = list.root;
	
	System.out.print("LinkedList: ");
	System.out.print(iter.data+" ");
	 
	iter = iter.next;
	
	while(iter!= list.root) {
		System.out.print(iter.data+" ");
		iter=iter.next;
	}
	
	
	
}

public CircularListoneway orderlyinsert (CircularListoneway list, int newData)
{
Node newNode = new Node(newData);

if (list.root==null) //bağlı liste boş ise
{
list.root=newNode;
list.root.next=list.root;
}

else if (newData<list.root.data)//gelen eleman roottan küçük
{
	//rootu değiştir
	newNode.next=list.root;
	Node iter=list.root;
	while(iter.next!=list.root)
		iter=iter.next;
	iter.next=newNode;//son elemanın nexti newNode a bağlandı
	list.root=newNode;	//ben ekledim		
}
else
{
Node iter=list.root;
while(iter.next!=list.root&& iter.next.data<newData)//if kullanmadım diye burda yazdım
	iter=iter.next;
Node temp = iter.next;
iter.next=newNode;
newNode.next =temp;
	
}

return list;

}

public CircularListoneway delete(CircularListoneway list, int deletedNodeData)
{
Node iter= list.root;

if (list.root.data==deletedNodeData)//silincek rootsa
{
while(iter.next!=list.root)//dairesel ya 
	iter=iter.next;
list.root=list.root.next;
iter.next=list.root;

return list; //buysa alttakileri yapmasın diye 
}

while(iter.next!=list.root&& iter.next.data!= deletedNodeData)
	iter=iter.next;

if(iter.next==list.root)
	System.out.println("sayı bulunamadı");
else
	iter.next=iter.next.next;
return list;




}
















}
