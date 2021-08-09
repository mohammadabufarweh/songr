package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void getterTest(){
		Album album1 = new Album("Hello", "amrdiab",14,250,"https://i.ytimg.com/vi/3NhXB2y0Mvc/maxresdefault.jpg");
		String expected = album1.getArtist();
		assertEquals("amrdiab",expected);
	}
	@Test  void setterTest(){
		Album album1 = new Album("Hello", "amrdiab",14,250,"https://i.ytimg.com/vi/3NhXB2y0Mvc/maxresdefault.jpg");
		String expected = album1.setArtist("moh");
		assertEquals("moh",expected);
	}
}
