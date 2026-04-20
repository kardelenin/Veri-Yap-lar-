package kuyruk;

public class ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue pirasa = new Queue(6);
		
		pirasa.enQueue(7);
		pirasa.enQueue(4);
		pirasa.enQueue(3);
		pirasa.print();
		pirasa.enQueue(5);
		pirasa.enQueue(9);
		pirasa.deQueue();
		pirasa.print();
		pirasa.enQueue(1);
		pirasa.enQueue(6);
		pirasa.print();
		pirasa.deQueue();
		pirasa.deQueue();
		pirasa.enQueue(8);
		pirasa.print();
		pirasa.print();
		pirasa.enQueue(8);
		pirasa.shift();
		pirasa.enQueue(8);
		pirasa.print();
	}

}
