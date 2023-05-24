package utilities;

public class Sleep {

	public static void sleep() {
		if(ConfigReader.getStringValue("invocation_mode").equalsIgnoreCase("demo")) {
		try {
			long ms = ConfigReader.getLongValue("sleep_time");
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
