package day06;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class ZuoyeTest {
	static WebDriver driver;
	static String ur1;
	static String url1;
  @BeforeTest
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		//进入网址
		ur1="http://localhost:8080/shop1/";	
  }
  /*前台：  一、搜索用商品类型搜索、用商品名搜索、用商品类型和商品名精确搜索
   * 二、购物
    登录--进入意见反馈--确定购买
      三、意见反馈
  	登录--进入意见反馈--发表意见
 后台：
  一、添加一个商品主分类
  二、删除订单
  三、发布公告
*/
  @Test
  public void af() throws InterruptedException {
	//搜索用商品类型搜索
	  driver.get(ur1);
		WebElement a=driver.findElement(By.name("select_type"));
		Select s1=new Select(a);
		s1.selectByVisibleText("电视机系列");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		//用商品名搜索
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.name("select_p_name")).sendKeys("照相机");
		driver.findElement(By.name("Submit")).click();
		Alert alert=driver.switchTo().alert();
	    alert.accept();
	    Thread.sleep(2000);
		//用商品类型和商品名精确搜索
	    driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
	    WebElement a1=driver.findElement(By.name("select_type"));
		Select s2=new Select(a1);
		s2.selectByVisibleText("电视机系列");
		Thread.sleep(2000);	
		WebElement a2=driver.findElement(By.name("select_p_name"));
		a2.sendKeys("电视机系列");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);	
		driver.navigate().back();
  }
  @Test
  public void blogin() throws InterruptedException {
	  //登录
	  driver.findElement(By.name("c_name")).sendKeys("123456");
	  driver.findElement(By.name("c_pass")).sendKeys("123");
	  driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
  //--进入意见反馈--
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/a")).click();
	  //点击主页
	  driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
	  //确认购买
	Thread.sleep(2000);
	//点击购买 
	driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[2]/table[2]/tbody/tr[1]/td[2]/p[3]/input")).click();
	 //去收银台结账
	driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
	//支付宝购买 
	WebElement a4=driver.findElement(By.name("pay_fangshi"));
	  Select s3=new Select(a4);
	  s3.selectByVisibleText("支付宝支付");
	 //地址
	  driver.findElement(By.name("pay_address")).sendKeys("江西南昌");
	  //Email
	  driver.findElement(By.name("pay_email")).sendKeys("3066307402@qq.com");
	  //点击确定付款
	  driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
	  driver.findElement(By.name("button")).click();
	 //发表意见
	  Thread.sleep(2000);
	  driver.findElement(By.name("c_message")).sendKeys("好烦哦");
	  driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
	 Thread.sleep(2000);
  }
  @Test
  public void cht() throws InterruptedException {
	//后台
	  url1="http://localhost:8080/shop1/admin/index.jsp";
	  driver.get(url1);
	  driver.findElement(By.name("a_name")).sendKeys("admin");
	  driver.findElement(By.name("a_pass")).sendKeys("admin");
	  driver.findElement(By.name("submit2")).click(); 
  //添加一个商品主分类
	  driver.switchTo().frame(0);//进入父类
		driver.switchTo().frame("Left");//进入子类并点击
		//点击添加商品主分类
		driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();//返回上一级
		driver.switchTo().frame("Rigth");//调回输入框子类
		//获取位置
		WebElement input5=driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[2]/input"));
		input5.sendKeys("你真好");//添加商品主类名称
		Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();//点击添加
	   driver.switchTo().parentFrame();//返回上一级
	   driver.switchTo().frame("Left"); //进入子类并点击
	 //编辑删除订单
	   driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a")).click();
	   Thread.sleep(2000);
	   driver.switchTo().parentFrame();////返回上一级
		driver.switchTo().frame("Rigth");//调回输入框子类
		//点击删除
	   driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td[6]/span/a")).click();
	   Thread.sleep(2000);
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame(0);//进入父类
		driver.switchTo().frame("Left");//进入子类并点击
		//点击编辑公告
	   driver.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/span/a")).click();
	   Thread.sleep(2000);
	   driver.switchTo().parentFrame();////返回上一级
		driver.switchTo().frame("Rigth");//调回输入框子类
		//获取位置
	   WebElement input6=driver.findElement(By.name("n_message"));
	 //编辑公告
	   input6.sendKeys("本店特价，买一送一，仅限前一百名");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();
  
  }
  @AfterTest
  public void afterClass() {
	  driver.close();
	  
  }

}
