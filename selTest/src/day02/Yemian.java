package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yemian {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/autotest.html";
	driver.get(url1);
	//�û�
	WebElement input=driver.findElement(By.name("account"));
	input.sendKeys("����");
	//����
	WebElement input1=driver.findElement(By.name("password"));
	input1.sendKeys("123456");
	//����
	WebElement select=driver.findElement(By.id("areaID"));
	Select select1=new Select(select);
	select1.selectByIndex(2);
	//�Ա�
	WebElement r=driver.findElement(By.id("sexID1"));
	//�ļ�
	WebElement r1=driver.findElement(By.id("u1"));
	r1.click();
	WebElement r2=driver.findElement(By.id("u2"));
	r2.click();
	//�ļ�
	String lu1="D:\\selenium\\selenium����ҵ";
	WebElement up=driver.findElement(By.name("file"));
	up.sendKeys(lu1);
	//submit�ύ
	WebElement bution=driver.findElement(By.id("buttonID"));
	bution.click();
	Thread.sleep(1000);
	Alert a=driver.switchTo().alert();
	a.accept();//ȷ��
}
}
