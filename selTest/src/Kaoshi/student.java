package Kaoshi;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class student {
	@Test
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//������ַ
		String url="http://localhost:8080/Exam_ssh/";
		driver.get(url);
		/*��½
		 * ��ӿ�������
		�������
		-������Ⲣ��ӡ
		���ѧ�� ���ȫ��ѧ������ӡ*/
		//�����̨����
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();
		//�����û���������
		WebElement a=driver.findElement(By.id("name"));
		a.sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
		//�����ӿ�������
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
		//��ת�ұߵĿ��
		driver.switchTo().parentFrame();
		//����Ծ����ƺͿ���ʱ��
		driver.findElement(By.id("testName")).sendKeys("����");
		driver.findElement(By.id("testTime")).sendKeys("8.30~11.30");
		driver.findElement(By.name("submit")).click();
		//�������
		driver.findElement(By.id("title")).sendKeys("��ʷ�����õĻʵ���˭");
		driver.findElement(By.id("choices")).sendKeys("Ǭ¡");
		driver.findElement(By.id("standardAnswer")).sendKeys("Ǭ¡");
		driver.findElement(By.name("submit")).click();
		//������Ⲣ��ӡ
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();
		String a2=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table")).getText();
		System.out.println(a2);
		//���ѧ�� ���ȫ��ѧ������ӡ
		driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();
		driver.findElement(By.id("id")).sendKeys("36252519981135");
		driver.findElement(By.id("realname")).sendKeys("����");
		driver.findElement(By.id("stuNumber")).sendKeys("201700005805");
		driver.findElement(By.id("className")).sendKeys("170307");
	driver.findElement(By.id("address")).sendKeys("�����ȷ�");
	driver.findElement(By.id("phone")).sendKeys("18279451797");
	driver.findElement(By.id("humanId")).sendKeys("36252519981135");
	driver.findElement(By.name("submit")).click();
	//���ѧ�� ���ȫ��ѧ������ӡ
	driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();
	WebElement a3=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table"));
	System.out.println(a3);
	}
}
