package Kaoshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class qiantaikaoshiTestTest {
	static WebDriver driver;
	static String url1;
	@BeforeClass
		public void open() {
		//�򿪹ȸ������
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		//������ַ
		 url1="http://localhost:8080/Exam_ssh/";
		driver.get(url1);
  }




  @Test
  public void login() throws InterruptedException {
	 // Thread.sleep(2000);
	  //������ӿ�ʼ���߿���
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
		//����ѧ�ź�����������ύ
		driver.findElement(By.name("stuNumber")).sendKeys("201700005805");
		driver.findElement(By.name("stuName")).sendKeys("����");
		driver.findElement(By.name("B1")).click();
		//�����ʼ
		driver.findElement(By.name("start_b")).click();
		//��ѡ
		 driver.findElement(By.name("questionOption")).click();
		 //�ύ
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
  }
  
  @AfterClass
  public void after() {
	  //�˳�
	  driver.close();
  }
}
