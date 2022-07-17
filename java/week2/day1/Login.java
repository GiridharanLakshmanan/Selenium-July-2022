package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		//logout.click();
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);
		if (attribute.equals("Logout")) {
			System.out.println("Successfully Logged In");
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Societe Generale");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Giridharan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmanan");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Employee");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("View Lead | opentaps CRM")) {
			System.out.println("Verified Title");
		}
		else {
			System.out.println("Title is not Verified");
		}
		}
	}

}
