package com.jenkinsexample.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class JenkinsdemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void printenv() {
		for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
