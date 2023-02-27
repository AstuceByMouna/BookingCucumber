package driverconf;

public class ConfigReader {

	public static String borowserType = null;

	public static void setBorowserType(String borowser) {

		borowserType = borowser;

	}

	public static String getborowserType() {

		if (borowserType != null) {

			return borowserType;
		}

		else
			throw new RuntimeException("Verify your testng.xml file , browser is not specified");
	}

}
