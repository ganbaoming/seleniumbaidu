package day03;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac1 {
	@Test
	public void open() throws InterruptedException {
		//�������
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(url);
		/*
		 * 1.��ͼindexҳ��
		 * 2.�ҵ������
		 * 3.����Ҽ�
		 * */
		WebElement wait=driver.findElement(By.className("wait"));
		Actions aa=new Actions(driver);
		aa.doubleClick(wait).perform();
		String a=driver.findElement(By.className("red")).getText();
		System.out.println(a);
}
}