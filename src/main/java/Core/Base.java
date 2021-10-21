package Core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.core.logging.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class Base {
	private static final WebDriverManager WebDriverManger = null;
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	private String propertyPath =".\\src\\test\\resources\\input\\property.properties";
	private String log4JPath =".\\src\\test\\resources\\input\\log4j.properties";
	
	/**
	 * W3e create a constructor here to initialize the variable values from prperties file
	 * 
	 */
	public Base() {
		BufferedReader reader = new BufferedReader(new FileReader(propertyPath));
		properties = new Properties();
		properties.load(reader);
			} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	public static String getUrl() {
		String url = properties.getProperty("url");
		return url;
	
		}
	public static String getBrowser() {
		String browser = properties.getProperty("browser");
		return browser;
}
	public static void openBrowser() {
	 driver.get(getUrl());
 }
	public static void tearDown() {
		driver.close();
		driver.quit();
		
	}
	
	public static void browser() {
		String browserName = getBrowser();
		switch(browserName) {
		case "chorme":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		
	}
	
	
}
