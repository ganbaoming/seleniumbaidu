package day01;

import java.awt.Dimension;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Openliu {
	@Test
	public void open() throws InterruptedException{
		//�򿪻�������
		//System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//����ַ
		String url1="https://www.baidu.com";
		String url2="http://www.v2ex.com";
		driver.get(url1);
		//�������
		driver.manage().window().maximize();
		//�����������С
		//Dimension dimension=new Dimension(500,800);
		//driver.manage().window().setSize(dimension);
		//ˢ��ҳ��
		driver.navigate().refresh();
		
		driver.navigate().to(url2);
		//����ҳ��
		driver.navigate().back();
		//ִ����ɺ󣬷��ذٶ�ҳ��
		//��ӡ����
		String title1=driver.getTitle();
		System.out.println(title1);
		//��ӡ��ǰ����ַ
		String url3=driver.getCurrentUrl();
		System.out.println(url3);
		
		Thread.sleep(100000);
		
		driver.navigate().forward();
		//��ӡ����
		String title2=driver.getTitle();
		System.out.println(title2);
		//��ӡ��ǰ����ַ
				String url4=driver.getCurrentUrl();
				System.out.println(url4);
	}
}
