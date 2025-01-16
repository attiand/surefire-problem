package org.test;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class Simple3Test {

 	@Test
	void shouldRunTest() throws InterruptedException {
		System.out.println("Test 3 is running");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Test 3 ended");
	}
}
