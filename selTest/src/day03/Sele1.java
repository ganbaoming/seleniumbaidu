package day03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {
	@Test
	public void open() throws InterruptedException {
		//�������
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//������ַ
		String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		//�����������ַ
		driver.get(url);
		/*
		 * 1.�л���Сҳ��
		 * 2.��λСҳ�����������
		 * 3.����Сҳ���е�Ԫ��
		 */
		//�л���Сҳ����ȥ
		//2���л���ʽ
		//��һ�֣������У�ֱ��д��frame��ǩ��id��name
//		driver.switchTo().frame("aa");
//		driver.findElement(By.id("user")).sendKeys("����");
		//�ڶ��ţ�����
		driver.switchTo().frame(0);
		driver.findElement(By.id("user")).sendKeys("����");
		Thread.sleep(2000);
		//���ص���ҳ�棬Ҳ�����ַ�ʽ
		//���ص�����ҳ��
		//��ҳ��---iframe--iframe
		//driver.switchTo().parentFrame();
		//ֱ����ת�����
		driver.switchTo().defaultContent();
		driver.findElement(By.id("user")).sendKeys("test");
		
}
}