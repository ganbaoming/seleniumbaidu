package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GouMai {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://localhost:8080/mobile_mysql/bg-resultTen.jsp";
	driver.get(url1);
	//�û���
	WebElement username=driver.findElement(By.name("name"));
	username.sendKeys("����");
	//����
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("123");
	//��¼
	WebElement bution=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input"));
	bution.click();
	//�������ƻ��
	driver.findElement(By.cssSelector("body > table:nth-child(7) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr > td > a:nth-child(1)")).click();
	//�鿴��������
	driver.findElement(By.cssSelector("body > table:nth-child(7) > tbody > tr > td:nth-child(2) > table:nth-child(4) > tbody > tr:nth-child(4) > td > div > a")).click();
	//���빺�ﳵ
	String url2="http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=11";
	driver.get(url2);
	driver.findElement(By.name("Submit")).click();
	//�Ŵ�ҳ��
	driver.manage().window().maximize();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(1000);
	alert.accept();
	//����
	driver.navigate().back();
	driver.navigate().back();
	//driver.findElement(By.cssSelector("image/2.jpg")).click();
	//���빺�ﳵ
	driver.findElement(By.linkText("���ﳵ")).click();
	//ȥ����̨����
	driver.findElement(By.linkText("ȥ����̨����")).click();
	//������ϵ��ַ
	WebElement DZ=driver.findElement(By.name("address"));
	DZ.sendKeys("�����ȷ�");
	//������ϵ�绰
	WebElement DH=driver.findElement(By.name("tel"));
	DH.sendKeys("18279451797");
	//����������
	WebElement s=driver.findElement(By.name("setMoney"));
	Select s1=new Select(s);
	s1.selectByVisibleText("֧����֧��");
	//����������
	WebElement x=driver.findElement(By.name("post"));
	Select x1=new Select(x);
	x1.selectByVisibleText("�ؿ�ר��");
	//��ע��Ϣ
	WebElement BZ=driver.findElement(By.name("bz"));
	BZ.sendKeys("�ϲ�����");
	//����ύ
  driver.findElement(By.name("Submit2")).click();
    //���������ת������������ȥ
    Alert alert1=driver.switchTo().alert();
    Thread.sleep(1000);
    alert1.accept();
    //�ر�
    Thread.sleep(2000);
   driver.quit();

}
}
