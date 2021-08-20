package mail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingYahooMail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.Yahoo.com");
		driver.findElement(By.xpath("//a[@class='_yb_khsbl']")).click();
		driver.findElement(By.xpath("//a[@id='createacc'])")).click();
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Jamuna");
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Devarajan");
		driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys("jdevarajan200595");
		driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("Myappa200595");
		driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys("9629650799");
		

		
	}

}
