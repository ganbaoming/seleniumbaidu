package day05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit {
	@Before
	public void c() {
		System.out.println("����@Before");	
	}
	@Test
public void a() {
	System.out.println("���ǵ�һ��@test");	
}
	@Test
	public void b() {
		System.out.println("���ǵڶ���@test");
	}
	@After
	public void d() {
		System.out.println("����@After");	
	}
}
