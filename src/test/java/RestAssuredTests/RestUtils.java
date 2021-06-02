package RestAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getFirstName() {		
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return "John"+generatedString;
	}
	public static String getLastName() {		
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return "watson"+generatedString;
	}
	public static String getUserName() {		
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return "Soham"+generatedString;
	}
	public static String getPassowrd() {		
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return "john"+generatedString;
	}
	public static String getemail() {		
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return "john"+generatedString+"@gmail.com";
	}

}
