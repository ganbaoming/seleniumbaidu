package day05zuoye;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Denglu {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//������ַ
	String url="http://localhost:8080/Banksys_ssh/login.jsp";
	driver.get(url);
	//�û���������
	WebElement a=driver.findElement(By.name("userNO"));
	a.sendKeys("1508329470158");
	WebElement a1=driver.findElement(By.name("password"));
	a1.sendKeys("123456");
	driver.findElement(By.id("loginValidate_0")).click();
	//��λ����ߵı߿�
	driver.switchTo().frame("leftFrame");
	Thread.sleep(2000);
	//��Ҫ���
	driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();
	//��ȡ�ұߵ�ҳ��
	driver.switchTo().parentFrame();
	driver.switchTo().frame("mainFrame");
	//������
	WebElement a2=driver.findElement(By.id("smoneyValidate_money"));
	a2.sendKeys("9999");
	driver.findElement(By.id("smoneyValidate_0")).click();
	//�������,���������Ϣ
	driver.switchTo().parentFrame();
	driver.switchTo().frame("leftFrame");
	driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
	//�����ұߣ���ӡ������Ϣ
	driver.switchTo().parentFrame();
	driver.switchTo().frame("mainFrame");
	String a4=driver.findElement(By.xpath("/html/body/center")).getText();
	System.out.println(a4);
}
}
