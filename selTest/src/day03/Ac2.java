package day03;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac2 {
	@Test
	public void open() throws InterruptedException {
		//�������
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		//���µ�ҳǩ
		/*
		 * 1.��indexҳ��
		 * 2.��λ��action��ť
		 * 3.������ƶ����ð�ť
		 * */
		driver.get(url);
		WebElement a=driver.findElement(By.className("over"));
		Actions aa=new Actions(driver);
		aa.moveToElement(a).perform();
		String h=driver.findElement(By.className("over")).getText();
		System.out.println(h);
}}
