package yigin;

public class stack {
	int top, size;
	int[] values;

	public stack(int size) {

		this.top=-1;
		this.size=size;
		this.values=new int[size];
		// TODO Auto-generated constructor stub
	}

	
	public void push(int deger)
	{
		if(isFull()==true)
		{
			System.out.print("stack dolu");
		}
		else
		{
		top++;
		values[top]=deger;
		}
		
		
	}
	
	public void sortedPush(int yeniDeger) {
	    // 1. Stack doluysa işlem yapma
	    if (isFull()) {
	        System.out.println("Stack dolu!");
	        return;
	    }

	    // 2. Yardımcı bir geçici stack oluştur (Dizi olarak)
	    int[] tempValues = new int[size];
	    int tempTop = -1;

	    // 3. MANTIK: Yeni gelen sayıdan DAHA BÜYÜK olanları kenara çek
	    // Böylece yeni sayı doğru yere (kendisinden küçüklerin üstüne) yerleşebilir
	    while (!isEmpty() && values[top] > yeniDeger) {
	        tempTop++;
	        tempValues[tempTop] = values[top]; // Üstteki büyük elemanı yedekle
	        pop(); // Asıl yığından çıkar
	    }

	    // 4. Yeni sayıyı şimdi güvenle en üste ekle
	    top++;
	    values[top] = yeniDeger;

	    // 5. Kenara ayırdığın büyük sayıları geri üstüne yükle
	    while (tempTop != -1) {
	        top++;
	        values[top] = tempValues[tempTop]; // Yedektekileri geri koy
	        tempTop--;
	    }
	}
	
	
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else return false;
	}	
	
	public void pop()
	{
		if(isEmpty()==true)
		System.out.print("Stack bos");
		
		else
			top--;
		
		
		
	}
	
	
	
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else return false;
					
	}

	public void printUpToDown()
	{
		if(isEmpty())
		{
			System.out.print("Stack boş");
		}
		else
		{
			for(int i=top;i>-1;i--)
			{
				System.out.print(values[i]+" ");
			}
		}
		
		
		
	}
	
	
	public void reset()
	{
		top=-1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
