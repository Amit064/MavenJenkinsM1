package Dummy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFirst {
	public static void main(String[]args) {
		System.out.println("hello");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://github.com/Amit064/MavenJenkinsM1/blob/main/src/test/java/Dummy/Simple.java");
	}

}
