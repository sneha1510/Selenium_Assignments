/*Open the Chrome browser.
Maximize the browser window.
Navigate to “https://qatechhub.com/”.
Write a method to print PASS if the title of the page matches with “QA Automation Tools Trainings and Tutorials | QA Tech Hub” else FAIL.
Navigate to the Facebook page (https://www.facebook.com)
Navigate back to the QA Tech Hub website.
Print the URL of the current page.
Navigate forward.
Reload the page.
Close the Browser.*/

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	ChromeDriver d;
	public void invokeBrowser()
	{
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\libs\\chromedriver.exe");
		
		d=new ChromeDriver();
		//Maximize the browser window.
		d.manage().window().maximize();
		//Navigate to “https://qatechhub.com/”.
		d.get("https://qatechhub.com/");
	}
	//Write a method to print PASS if the title of the page matches with “QA Automation Tools Trainings and Tutorials | QA Tech Hub” else FAIL.
	public void verifyPageTitle()
	{
		String Expected_title="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		String Actual_title=d.getTitle();
		if(Actual_title==Expected_title)
		{
			System.out.println("Pass Title matched");
		}
		else
		{
			System.out.println("Fail title doesnt matched");
		}
	}
	//Navigate to the Facebook page (https://www.facebook.com)
	public void Navigate()
	{
		d.navigate().to("https://www.facebook.com");
		//Navigate back to the QA Tech Hub website.
		d.navigate().back();
		//url from webpage
		String urlfromwebpage=d.getCurrentUrl();
		System.out.println("Current Url"+urlfromwebpage);
		//Navigate forward.
		d.navigate().forward();
		//Refresh
		d.navigate().refresh();
	}
	public void Closebrowser()
	{
		d.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 a=new Assignment1();
		a.invokeBrowser();
		a.verifyPageTitle();
		a.Navigate();
		a.Closebrowser();

	}

}
