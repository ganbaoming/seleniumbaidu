package day07;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Disanzhouhanjiazuoye {
	static WebDriver driver;
	static String url;
	@BeforeClass
	public static void open () {
		/*1�� ����Qunar��Ʊ��ҳhttp://flight.qunar.com��ѡ�񡰵��̡������������������У�ѡ��today+7�պ�����ڣ��㡰����������ת����Ʊ���������б�ҳ��
			 
			2�� ���б�ҳͣ��1���ӣ�����ҳ���ϳ��֡�������������

			3�� ������ֺ����б����ڳ��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б��л���֡���һ�̡��� ���ڶ��̡�������û�г��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б�ײ��л���֡����۷�Χ�� 
			4�� ��������ֺ����б���ҳ�����֡��ú��ߵ�ǰ�޿��ۺ��ࡱ*/

	//�������
	System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
	driver = new ChromeDriver();
	url = " http://flight.qunar.com";
	}
	@Test
	public void login() {
		// ����Qunar��Ʊ��ҳhttp://flight.qunar.com��ѡ�񡰵��̡������������������У�ѡ��today+7�պ�����ڣ��㡰����������ת����Ʊ���������б�ҳ��
	driver.get(url);
	driver.findElement(By.xpath("//*[@id=\"js_lab_sng\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[1]/div[3]/b")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[1]/span[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[5]/dl[4]/dd/ul/li[6]/a")).click();

	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[1]/div[3]/b")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/span[5]")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[6]/dl[3]/dd/ul/li[5]/a")).click();

	driver.findElement( By.id("//*[@id=\"dfsForm\"]/div[3]/div[1]/div/div[1]/div[3]/span")).click();
	driver.findElement(By.linkText("����")).click();
	}
	@AfterClass
	public static void close() {


	}
}