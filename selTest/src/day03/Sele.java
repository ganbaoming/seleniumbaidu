package day03;


import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
	driver.get(url);
	//�����µ�ҳǩ
	String dq=driver.getWindowHandle();
	driver.findElement(By.linkText("Open new window")).click();
	/*
	 * 
	 * */
	//��ȡ��ǰҳ�����еľ������ǰ������ҳ�棬��������һ���ַ��������������������
	Set<String>w=driver.getWindowHandles();
	//����ھ�������У�ѡ��һ�����
	for(String handle:w) {
		driver.switchTo().window(handle);//ת���þ��ȥ
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		//ͨ�������жϣ�����ȡ��ҳ���Ƿ�ʵ����Ҫ��
		//���������Ҫ�ģ��ͶԸ�ҳ�棬���в���
		if("UIAutomation iFrame".equals(title)){
		Thread.sleep(1000);	
			driver.findElement(By.id("user")).sendKeys("����");
			//driver.findElement(By.linkText("baidu")).click();
			//break;
		}
		driver.switchTo().window(dq);//ת���þ��ȥ
		Thread.sleep(1000);
		String title1=driver.getTitle();
		if("UIAutomation iFrame".equals(title)){
			Thread.sleep(1000);	
			WebElement a=driver.findElement(By.id("user"));
			a.sendKeys("����");
	}
	
}
}
}
