package yigin;

public class ana {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stack stackExample= new stack(5);
		
	
		
		stackExample.sortedPush(8);
		stackExample.sortedPush(5);
		stackExample.sortedPush(9);
		stackExample.sortedPush(3);
		stackExample.sortedPush(1);
		stackExample.printUpToDown();
	}


}
