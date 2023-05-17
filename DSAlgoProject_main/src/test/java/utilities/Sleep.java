package utilities;

public class Sleep {

	public static void sleep(long miliseconds) {
		if(ConfigReader.getInvocationMode().equalsIgnoreCase("demo")) {
		try {
			long ms = 1000;
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
