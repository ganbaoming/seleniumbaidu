package day06;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zuoye {
	@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//������ַ
	String url="http://localhost:8080/shop1/";
	driver.get(url);
	//��������Ʒ��������
	WebElement a=driver.findElement(By.name("select_type"));
	Select s1=new Select(a);
	s1.selectByVisibleText("���ӻ�ϵ��");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	//����Ʒ������
	driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("select_p_name")).sendKeys("�����");
	driver.findElement(By.name("Submit")).click();
	Alert alert=driver.switchTo().alert();
    alert.accept();

	Thread.sleep(2000);
	//����Ʒ���ͺ���Ʒ����ȷ����
	WebElement a1=driver.findElement(By.name("select_type"));
	Select s2=new Select(a1);
	s2.selectByVisibleText("���ӻ�ϵ��");
	WebElement a2=driver.findElement(By.name("select_p_name"));
	a2.sendKeys("���ӻ�ϵ��");
	driver.findElement(By.name("Submit")).click();
	driver.navigate().back();
	//��¼--�����������--�������
	 driver.findElement(By.name("c_name")).sendKeys("123456");
	  driver.findElement(By.name("c_pass")).sendKeys("123");
	  driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
 //--�����������--
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/a")).click();
	  //�����ҳ
	  driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
	  //ȷ�Ϲ���
	Thread.sleep(2000);
	//������� 
	driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[2]/table[2]/tbody/tr[1]/td[2]/p[3]/input")).click();
	 //ȥ����̨����
	driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
	//֧�������� 
	WebElement a4=driver.findElement(By.name("pay_fangshi"));
	  Select s3=new Select(a4);
	  s3.selectByVisibleText("֧����֧��");
	 //��ַ
	  driver.findElement(By.name("pay_address")).sendKeys("�����ϲ�");
	  //Email
	  driver.findElement(By.name("pay_email")).sendKeys("3066307402@qq.com");
	  //���ȷ������
	  driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
	  driver.findElement(By.name("button")).click();
	 //�������
	  Thread.sleep(2000);
	  driver.findElement(By.name("c_message")).sendKeys("�÷�Ŷ");
	  driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
	 Thread.sleep(2000);
	//��̨
	String  url1="http://localhost:8080/shop1/admin/index.jsp";
	  driver.get(url1);
	  driver.findElement(By.name("a_name")).sendKeys("admin");
	  driver.findElement(By.name("a_pass")).sendKeys("admin");
	  driver.findElement(By.name("submit2")).click(); 
 //���һ����Ʒ������
	  driver.switchTo().frame(0);//���븸��
		driver.switchTo().frame("Left");//�������ಢ���
		driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td")).click();//��������Ʒ������
		Thread.sleep(2000);
		driver.switchTo().parentFrame();////������һ��
		driver.switchTo().frame("Rigth");//�������������
		WebElement input5=driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[2]/input"));//��ȡλ��
		input5.sendKeys("�����");//�����Ʒ��������
		Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();//������
	   driver.switchTo().parentFrame();//������һ��
	   driver.switchTo().frame("Left");//�������ಢ���
	   driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a")).click();//�༭ɾ������
	   Thread.sleep(2000);
	   driver.switchTo().parentFrame();////������һ��
		driver.switchTo().frame("Rigth");//�������������
	   driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td[6]/span/a")).click();//���ɾ��
	   Thread.sleep(2000);
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame(0);//���븸��
		driver.switchTo().frame("Left");//�������ಢ���
	   driver.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/span/a")).click();//����༭����
	   Thread.sleep(2000);
	   driver.switchTo().parentFrame();////������һ��
		driver.switchTo().frame("Rigth");//�������������
	   WebElement input6=driver.findElement(By.name("n_message"));//��ȡλ��
		input6.sendKeys("����ɵ��");//�༭����
		//Thread.sleep(2000);
	  // driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();//�����������
	   }

	}
	
