package utilities;

public class Sleep {

	public static void sleep() {
		if(ConfigReader.getInvocationMode().equalsIgnoreCase("demo")) {
		try {
			long ms = ConfigReader.getSleepTime();
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
