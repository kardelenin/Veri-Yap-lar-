package kuyruk;

public class Queue {
	
    int front = -1;
    int rear = -1;
    int[] values;
    int size;

public Queue(int size)
{
this.size=size;
values=new int[size];
}

public boolean isEmpty()
{
if(rear==-1 && front==-1)
return true;
else 
return false;
}

public boolean isFull()
{
return rear==size-1;
}

public void enQueue(int sayi)
{
if(isFull())
System.out.println("Kuyruk dolu");
else 
{
if(isEmpty())
{
	front=0;
	values[++rear]=sayi;
}
else
values[++rear]=sayi;
}
}

void reset()
{
front=rear=-1;	
}

public void deQueue()
{
if(isEmpty())
{
	System.out.println("kuyruk bos");
}
else {
	front++;
	
}
}

void print()
{
if(isEmpty())
{
System.out.print("kuyruk bos");	
}
else
{
for(int i=front;i<=rear;i++)
System.out.print(values[i]+" ");
System.out.println();}

}


void shift()
{
int elemansayi=rear-front+1;
for(int i=0; i<elemansayi; i++)
{
values[i]=values[front+i];	
}
rear=rear-front;
front=0;


}

void reversePrint()
{
	if(isEmpty())
		System.out.print("kuyruk bos");
	else {
for(int i=rear;i>=front;i--)
System.out.print(values[i]+" ");	}
	
}




}







