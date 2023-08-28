package StepDefinitions;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import ShareKhanCore.WebConnector;
import ShareKhan_Util.testUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class ShareKhan_launching_Test extends WebConnector{
	
	   
	

	  @Given("^ShareKhan website is open in the browser$")
	    public void sharekhan_website_is_open_in_the_browser() throws Throwable 
	    {
		  try{
			  report.startTest("ShareKhan website is open in the browser");	   
		      Thread.sleep(5000);
		      System.out.println("ShareKhan website is open in the browser");
		      report.log(LogStatus.INFO, "ShareKhan website is open");
			  driver.get(config.getProperty("testsite"));
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40L));
			  report.log(LogStatus.INFO, "Get Title");
			  System.out.println(driver.getTitle());
		  }catch (Throwable t)
			{
			  report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
				testUtil.captureScreenshot("ShareKhan_launching_Test");
				report.attachScreenshot(testUtil.mailscreenshotpath);
				Assert.assertTrue(false, t.getMessage());
				
			}
			
	    }

	  
	  @Then("^the website is launched successfully$")
	    public void the_website_is_launched_successfully() throws Throwable 
	    {
		  try{
			   Thread.sleep(2000);
			   report.startTest("the website is launched successfully");
			   report.log(LogStatus.INFO, "ShareKhan website is launched successfully");
		       System.out.println("the website is launched successfully");
		       
			  }catch (Throwable t)
				{
				  report.log(LogStatus.FAIL, "Sharekhan website launching Failed");
			      testUtil.captureScreenshot("ShareKhan_launching_Test");
				  report.attachScreenshot(testUtil.mailscreenshotpath);
				  Assert.assertTrue(false, t.getMessage());
				
			}
	    }
	    
	    
	 
	    @When("^user clicks on main menu$")
	    public void user_clicks_on_main_menu() throws Throwable 
	    {
	    	
	    	try{
	    	Thread.sleep(5000);
	    	report.startTest("user clicks on main menu button");
	    	report.log(LogStatus.INFO, "user clicks on main menu button");
	    	System.out.println("user clicks on main menu");
	    	report.log(LogStatus.INFO, "user Validate MarketButton");
	    	 WebElement MarketButton=driver.findElement(By.xpath(object.getProperty("MarketButton")));
	    	 MarketButton.click();
	    	 System.out.println(MarketButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 report.log(LogStatus.INFO, "user Validate NewToMarketButton");
	    	 Thread.sleep(5000);
	    	 WebElement NewToMarketButton=driver.findElement(By.xpath(object.getProperty("NewToMarketButton")));
	    	 NewToMarketButton.click();
	    	 System.out.println(NewToMarketButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 report.log(LogStatus.INFO, "user Validate SuperInverstorButton");
	    	 Thread.sleep(5000);
	    	 WebElement SuperInverstorButton=driver.findElement(By.xpath(object.getProperty("SuperInverstorButton")));
	    	 SuperInverstorButton.click();
	    	 System.out.println(SuperInverstorButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 report.log(LogStatus.INFO, "user Validate ActiveTenderButton");
	    	 Thread.sleep(5000);
	    	 WebElement ActiveTenderButton=driver.findElement(By.xpath(object.getProperty("ActiveTenderButton")));
	    	 ActiveTenderButton.click();
	    	 System.out.println(ActiveTenderButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 report.log(LogStatus.INFO, "user Validate MutualFundsButton");
	    	 Thread.sleep(5000);
	    	 WebElement MutualFundsButton=driver.findElement(By.xpath(object.getProperty("MutualFundsButton")));
	    	 MutualFundsButton.click();
	    	 System.out.println(MutualFundsButton.getText());
	    	 driver.navigate().back();
	    	
	    	 report.log(LogStatus.INFO, "user Validate ResearchButton");
	    	 Thread.sleep(5000);
	    	 WebElement ResearchButton=driver.findElement(By.xpath(object.getProperty("ResearchButton")));
	    	 ResearchButton.click();
	    	 System.out.println(ResearchButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 report.log(LogStatus.INFO, "user Validate EducationFirstButton");
	    	 Thread.sleep(5000);
	    	 WebElement EducationFirstButton=driver.findElement(By.xpath(object.getProperty("EducationFirstButton")));
	    	 EducationFirstButton.click();
	    	 System.out.println(EducationFirstButton.getText());
	    	 driver.navigate().back();
	    	 
	    	 report.log(LogStatus.INFO, "user Validate ProductandServiceButton");
	    	 Thread.sleep(5000);
	    	 WebElement ProductandServiceButton=driver.findElement(By.xpath(object.getProperty("ProductandServiceButton")));
	    	 ProductandServiceButton.click();
	    	 System.out.println(ProductandServiceButton.getText());
	    	 driver.navigate().back();
	         }catch (Throwable t)
		     {
	        	 report.log(LogStatus.FAIL, "user clicks on main menu is Failed");
	        	 testUtil.captureScreenshot("ShareKhan_launching_Test");
					report.attachScreenshot(testUtil.mailscreenshotpath);
					Assert.assertTrue(false, t.getMessage());
			
		      }
	    	 
	    }
	    

	    @Then("^main menu pop is displayed$")
	    public void main_menu_pop_is_displayed() throws Throwable 
	    {
	    	try{
	    		report.startTest("main menu popup is displayed");
	    		report.log(LogStatus.INFO, "main menu popup is displayed");
	           Thread.sleep(5000);
	           System.out.println("main menu pop is displayed");  
	    	}catch (Throwable t)
			{
	    		report.log(LogStatus.FAIL, "main menu popup is displayed is Failed");
	    		testUtil.captureScreenshot("ShareKhan_launching_Test");
				report.attachScreenshot(testUtil.mailscreenshotpath);
				Assert.assertTrue(false, t.getMessage());
				
			}
	    }
	    
	    
		

}
