package org.test;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class Simple1Test {

 	@Test
	void shouldRunTest() throws InterruptedException {
		System.out.println("Test 1 is running");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Test 1 ended");
	}
}
