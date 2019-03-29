package net.rodor.holaspringbatch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskletA implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution step, ChunkContext chunk) throws Exception {
		System.out.println("Ejecutando TaskletA");
		
		// !!! si encontramos algo que debiera parar el job ejecutamos las siguiente lineas !!!!
		//chunk.getStepContext().getStepExecution().upgradeStatus(BatchStatus.STOPPED);
		//return RepeatStatus.FINISHED;
		
		
		return RepeatStatus.FINISHED;
	}

}
