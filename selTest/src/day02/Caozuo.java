package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Caozuo {
@Test
public void open() throws InterruptedException {
	//�������
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//������ַ
	String url="file:///D:/html/index.html";
	//�����������ַ
	driver.get(url);
	WebElement input=driver.findElement(By.id("user"));
	//��������
	input.sendKeys("�ؼ�����");
	WebElement select=driver.findElement(By.id("moreSelect"));
	Select select1=new Select(select);
	//��һ�ַ�ʽ������������ѡ����һ��ѡ������ݴ�0��ʼ
	//select1.selectByIndex(3);
	//�ڶ��ַ�ʽ��by value
	//select1.selectByValue("xiaomi");
	//�����ַ�ʽ��ͨ���ɼ���ֵ
	select1.selectByVisibleText("huawei");
	//��ѡ��
	WebElement r=driver.findElement(By.className("Volvo"));
	//��ӡ�Ƿ�ѡ����
		System.out.println(r.isSelected());
	r.click();
	System.out.println(r.isSelected());
	//��ѡ��
	WebElement r1=driver.findElement(By.name("checkbox1"));
	//�����ťû�б�ѡ����ô��ѡ����
	if(!r1.isSelected()) {
	r1.click();}
	WebElement r2=driver.findElement(By.name("checkbox2"));
	r2.click();
	
	WebElement b1=driver.findElement(By.name("buttonhtml"));
	System.out.println(b1.isSelected());
	
	//���alert��ť
	WebElement a1=driver.findElement(By.className("alert"));
	a1.click();
	Thread.sleep(1000);
	//���������ת������������ȥ
	Alert alert=driver.switchTo().alert();
	Thread.sleep(1000);
	alert.accept();
	
	WebElement co1=driver.findElement(By.className("confirm"));
	co1.click();
	Alert cl1=driver.switchTo().alert();
	cl1.accept();//ȷ��
	Thread.sleep(1000);
	cl1.dismiss();//ȡ��
	
	//������ٵ����ť
//	WebElement p1=driver.findElement(By.className("prompt"));
//	p1.click();
//	
//	Thread.sleep(1000);
//	
//	Alert pp1=driver.switchTo().alert();
//	Thread.sleep(1000);
//	pp1.sendKeys("����");
//	
//	String aa=pp1.getText();
//	System.out.println(aa);
//	
//	pp1.accept();
//	Thread.sleep(1000);
//	pp1.accept();
//	
	//�����ļ���·��
	String lu="D:\\selenium\\selenium����ҵ";
	WebElement up=driver.findElement(By.id("load"));
	up.sendKeys(lu);
}
}
