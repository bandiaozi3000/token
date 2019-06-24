package com.jwt.token;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TokenApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test(){
		BigDecimal bigDecimal = new BigDecimal(1);
		System.out.println(bigDecimal.setScale(2));
	}

}
