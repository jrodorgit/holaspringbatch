package net.rodor.holaspringbatch.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HolaSpringBatchTest {

	@Test
	public void test() {
		System.out.println("Implementado test.");
		// load batch a ejecutar
		ApplicationContext context = 
						new ClassPathXmlApplicationContext("spring/job-hello-batch.xml");
					
				
		System.out.println("Scheduler lanzado!");
		assertTrue(true);
	}

}
