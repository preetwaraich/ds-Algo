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

	
	
	public static String getStringValue(String key) {
		if (prop == null)
			init_properties();
		String value = prop.getProperty(key);
		if (value != null)
			return value;
		else
			throw new RuntimeException(key+" not specified in the config.properties file.");
	}
	
	public static long getLongValue(String key) {
		if (prop == null)
			init_properties();
		String value = prop.getProperty(key);
		if (value != null)
			return Long.parseLong(value);
		else
			throw new RuntimeException(key+" not specified in the config.properties file.");
	}

	public static int getIntValue(String key) {
		if (prop == null)
			init_properties();
		String value = prop.getProperty(key);
		if (value != null)
			return Integer.parseInt(value);
		else
			throw new RuntimeException(key+" not specified in the config.properties file.");
	}
	
	

}