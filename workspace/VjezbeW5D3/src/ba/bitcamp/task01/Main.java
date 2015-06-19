package ba.bitcamp.task01;

public class Main {

	public static void main(String[] args) {
		
		MobileSpeakers ms1 = new MobileSpeakers("LG", 500, 2);

		ms1.enable();
		ms1.increaseVolume();
	//	System.out.println(ms1);
		
		
		MobileAntenna ma1 = new MobileAntenna("LG", 3);
		//System.out.println(ma1);
		MobileDisplay md1 = new MobileDisplay("LG", 2);
		md1.turnOn();
		//System.out.println(md1);
		MobileBattery mb1 = new MobileBattery("LG", 0.5);
		//System.out.println(mb1);
		
		Mobile lg = new Mobile("LG", md1, ms1, mb1, ma1);
		System.out.println(lg);
		
		System.out.println("\nPoslije pet sati rada baterija ima "+lg.getBatteryStatusAfterWork(5)+"%");
		
		System.out.println("\nPoslije punjenja od 1h baterija ima "+lg.getBatteryStatusAfterCharging(1)+"%");
	}

}
