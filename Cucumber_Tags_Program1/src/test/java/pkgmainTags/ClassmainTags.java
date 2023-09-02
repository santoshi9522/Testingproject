package pkgmainTags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ClassmainTags 
{
	public WebDriver d;
	public WebElement about;
	public WebElement unlink;
	public WebElement flink;
	public WebElement hlink;
	public WebElement cnt;
	public WebElement fname;
	public WebElement lname;
	public WebElement email;
	public WebElement msg;
	public WebElement submit;
	public WebElement plink;
	public WebElement demolink;
	
	
	@Given("Launch Site")
	public void launch_site() 
	{
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--remote-allow-origins=*");
	    opt.addArguments("--disable-notifications");
	    d = new ChromeDriver(opt);
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    d.get("https://thedemosite.co.uk/");
	    d.manage().window().maximize();
	      }
	
	@When("Click on About Link")
	public void click_on_about_link()
	{
		about = d.findElement(By.xpath("//*[@id=\'menu-item-22\']/a/span[2]"));
		about.click();
	}
	@When ("Click on uncategorized link")
	public void click_on_uncategorized_link()
	{
		unlink = d.findElement(By.xpath("//*[@id=\'block-9\']/ul/li/a"));
		unlink.click();
	}
	
	@When ("Click on First link")
	public void click_on_first_link()
	{
		flink = d.findElement(By.xpath("//*[@id=\'post-364\']/div/div/header/h2/a"));
		flink.click(); 
	}
	@When ("Click on Home link")
	public void click_on_home_link()
	{
		hlink = d.findElement(By.xpath("//*[@id=\'page\']/div[1]/div/div/div/nav/p/a[1]"));
		hlink.click(); 
	}
		
	@Then("Smoke test is passed")
	public void smoke_test_is_passed()
	{
		System.out.println("Smoke Test is Successfully passed");
	}

	@Given("Launch Site two")
	public void launch_site_two()
	{
		d.get("https://thedemosite.co.uk/");
	}
	
	@When ("Click on Contact link")
	public void click_on_contact_link()
	{
	  cnt = d.findElement(By.xpath("//*[@id=\'menu-item-25\']/a/span[2]"));
		cnt.click();
	}
	
	@When ("Enter First name")
	public void enter_first_name()
	{
		fname = d.findElement(By.xpath("//*[@id=\'post-24\']/div/div/form/div[1]/input"));
		fname.sendKeys("PORS");
	}
	
	@When ("Enter Last name")
	public void enter_last_name()
	{
		lname = d.findElement(By.xpath("//*[@id=\'post-24\']/div/div/form/div[2]/input"));
		lname.sendKeys("ABC");
	}
	
	@When ("Enter Email")
	public void enter_email()
	{
		email = d.findElement(By.xpath("//*[@id=\'post-24\']/div/div/form/div[3]/input"));
		email.sendKeys("pqr01@cmail.com");
	}
	
	@When ("Enter Message ")
	public void enter_message()
	{
		msg = d.findElement(By.xpath("//*[@id=\'post-24\']/div/div/form/div[4]/textarea"));
		 msg.sendKeys("Testing of URL");
	}
	
	@When ("Click on Submit")
	public void click_on_submit()
	{
		submit = d.findElement(By.xpath("//*[@id=\'post-24\']/div/div/form/div[7]/button/div"));
		 submit.click();
	}
	@When ("Click on Privacy policy link")
	public void click_on_privacy_policy_link()
	{
		plink = d.findElement(By.xpath("//*[@id=\'block-8\']/ul/li[3]/a"));
		 plink.click();
	}
	
	@When ("Click on The demo site link")
	public void click_on_the_demo_site_link()
	{
		demolink = d.findElement(By.xpath("//*[@id=\'ast-desktop-header\']/div[1]/div/div/div/div[1]/div/div/span/a/img"));
		demolink.click();
	}
	
	@Then("Sanity test is passed")
	public void sanity_test_is_passed()
	{
		System.out.println("Sanity Test is Successfully passed");
	} 

	
}
