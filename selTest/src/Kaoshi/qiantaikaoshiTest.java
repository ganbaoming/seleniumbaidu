package Kaoshi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class qiantaikaoshiTest {
	WebDriver driver;
	String url1;
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://localhost:8080/Exam_ssh/";
	driver.get(url1);
	/*2,ǰ̨
	��½-����һ�ο���*/
	//���뿪ʼ����ҳ��
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
	//����ѧ�ź�����
	driver.findElement(By.name("stuNumber")).sendKeys("201700005805");
	driver.findElement(By.name("stuName")).sendKeys("����");
	//����ύ
	driver.findElement(By.name("B1")).click();
	//�����ʼ��ť
	driver.findElement(By.name("start_b")).click();
	//��ѡ
	  driver.findElement(By.name("questionOption")).click();
	 //�ύ
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
  }
}
