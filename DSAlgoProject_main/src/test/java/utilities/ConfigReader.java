package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop = null;

	public static Properties init_properties()

	{
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
							+ "resources" + File.separator + "config" + File.separator + "config.properties");
			try {
				prop.load(ip);
				ip.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return prop;
	}

	public static String getBrowser() {
		if (prop == null)
			init_properties();

		String browserName = prop.getProperty("Browser");
		if (browserName != null)
			return browserName;
		else
			throw new RuntimeException("Browser is  not specified in the config.properties file.");
	}

	public static String getApplicationUrl() {
		if (prop == null)
			init_properties();
		String url = prop.getProperty("App_Url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}

	public static String getHomePageUrl() {
		if (prop == null)
			init_properties();
		String url = prop.getProperty("Homepage_url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}

	public static String getUserName() {
		if (prop == null)
			init_properties();
		String username = prop.getProperty("username");
		if (username != null)
			return username;
		else
			throw new RuntimeException("username not specified in the config.properties file.");
	}

	public static String getInvocationMode() {
		if (prop == null)
			init_properties();

		String invocation_mode = prop.getProperty("invocation_mode");// System.out.println(invocation_mode);
		if (invocation_mode != null)
			return invocation_mode;
		else
			throw new RuntimeException("Browser is  not specified in the config.properties file.");
	}

}