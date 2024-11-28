package TV;

public class testTV {

	public static void main(String[] args) {
		TV tv1 = new TV();
		
		tv1.turnOn();
		tv1.volumeLevelUp(5);
		tv1.channelUp(20);
		System.out.println(tv1.toString());
		
		tv1.turnOn();
		tv1.volumeLevelUp(6);
		tv1.channelUp(90);
		System.out.println(tv1.toString());
		
		tv1.turnOff();
		System.out.println(tv1.toString());
		
		tv1.turnOn();
		tv1.volumeLevelDown(7);
		tv1.channelDown(15);
		System.out.println(tv1.toString());
		
	}

}
