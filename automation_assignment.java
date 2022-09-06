package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation_assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//C://selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.get("https://www.ribblecycles.co.uk/");
		
		driver.findElement(By.xpath("//*[@id=\"viewport\"]/div[1]/div[1]/header/div/div/div[3]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"viewport\"]/div[5]/div[2]/div/div/form/div[1]/div[1]/input")).sendKeys("shubhamshendre22@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"viewport\"]/div[5]/div[2]/div/div/form/div[2]/div[1]/input")).sendKeys("Share@123");
		driver.findElement(By.xpath("//*[@id=\"viewport\"]/div[5]/div[2]/div/div/form/button/span")).click(); 
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/header/div/div/div[3]/div/button[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("HT 725");
		driver.findElement(By.xpath("//*[@id='viewport']//following::h2[3]")).click();	
		driver.findElement(By.xpath("//*[@id=\"bike-builder-blocks\"]/div/div/ul/li[3]/div/div/a")).click();	
		driver.findElement(By.xpath("//*[@id='viewport']//following::h3[3]")).click();
	    WebElement add=	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[1]/div/div/div[1]/div[4]/div[2]/div[5]/button[1]/span"));
		add.click();
	    if(add.isEnabled())
			System.out.println("User can add product to cart");
		else
			System.out.println("User cannot add product to cart");
	}
}
