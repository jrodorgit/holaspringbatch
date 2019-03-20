package net.rodor.holaspringbatch.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloBatch {

	public static void main(String[] args) {
		
		// load batch a ejecutar
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/job-hello-batch.xml");
			
		
		System.out.println("Scheduler lanzado!");
	}

}
