package aa;

import org.testng.annotations.Test;

public class Demo_Test {
	@Test
	public void printTest() {
		System.out.println("hello");
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String UN = System.getProperty("username");
		String pwd = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(UN);
		System.out.println(pwd);
		
	}
	
	@Test
	public void Create_contactTest() {
		System.out.println("execute contact test");
	}
}
