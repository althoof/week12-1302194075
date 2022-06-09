import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.pprintln("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.pprintln("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.pprintln("Current count:" + counter.getCount());
		
	}

}
