package Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization_test {
	
	@Test(dataProvider="readdata")
	public void login_test(String user,String pass,String theme)
	{
		System.out.println("Userid="+user+ "--Pwd="+pass+ "--Theme="+theme);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:100/");
		driver.findElement(By.name("user_name")).sendKeys(user);
		driver.findElement(By.name("user_password")).sendKeys(pass);
		driver.findElement(By.name("login_theme")).sendKeys(theme);
		driver.findElement(By.name("Login")).click();			
		driver.close();
		
	}
	
	@DataProvider
	public Object[][] readdata()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="xyz";
		data[0][1]="xyz";
		data[0][2]="blue";
		
		data[1][0]="admin";
		data[1][1]="admin";
		data[1][2]="orange";
		
		return data;
				
	}

}
